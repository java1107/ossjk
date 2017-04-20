package com.jkoss.wx.ctrl;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jkoss.wx.msg.EventInMsg;
import com.jkoss.wx.msg.NewMessageItem;
import com.jkoss.wx.msg.NewsMessage;
import com.jkoss.wx.msg.TextMessage;
import com.jkoss.wx.tools.J1107WXConstants;
import com.jkoss.wx.tools.WXMessageUTIL;

@Controller
@RequestMapping("/wx/")
public class WeixinCtrl {

	@Autowired
	private WXMessageUTIL   wxUtil;
	
	@RequestMapping(value="/",produces="text/paint; charset=utf-8",method=RequestMethod.GET)
	@ResponseBody
	public String 微信的真实性校验(HttpServletRequest request){
		return wxUtil.checkSignature(request);
	}
	
	
	@RequestMapping(value="/",produces="text/paint; charset=utf-8",method=RequestMethod.POST)
	@ResponseBody
	public String 微信逻辑(HttpServletRequest request){
		
		// 取得请求的类型
		Document doc;
		try {
			doc = new SAXReader().read(request.getInputStream());
			// 使用XPath技术取得MsgType doc
			List<Node> msgTypeNodes = doc.selectNodes("xml/MsgType");
			if (msgTypeNodes != null) {
				String MsgType = msgTypeNodes.get(0).getText();
                 //System.out.println(MsgType +":"+doc.asXML());
				// 处理文本消息
				if (J1107WXConstants.XML_MSG_TEXT.equals(MsgType)) {
					TextMessage tm = (TextMessage) wxUtil.toBean(doc.asXML(), TextMessage.class);
					
					if("?".equals(tm.getContent())   ){
						//回复消息
						return wxUtil.replyTextMsg("你好，欢迎光临，请输入操作编号:\n 1.查询积分\n 2.查询余额 \n 3.人工帮助", tm);
					    
					}else if("2".equals(tm.getContent())   ){
						return  wxUtil.replyTextMsg("您的现金余额是:"+new java.util.Random().nextInt(5000), tm);
					}else if("1".equals(tm.getContent())   ){
						return  wxUtil.replyTextMsg("您的积分是:"+new java.util.Random().nextInt(100), tm);
					}else if("3".equals(tm.getContent())   ){
						System.out.println(tm.getContent());
					     //图文
						NewsMessage msg = new NewsMessage();
						msg.setFromUserName(tm.getToUserName());
						msg.setToUserName(tm.getFromUserName());
						msg.setCreateTime(new Date().getTime());
						msg.setMsgType(J1107WXConstants.XML_MSG_NEWS);
						msg.setArticleCount(3);
						
						NewMessageItem item1 = new NewMessageItem();
						item1.setDescription("发动机号给");
						item1.setPicUrl("http://j1107d.tunnel.qydev.com/j1107ssmWX/imgs/a1.jpg");
						item1.setUrl("http://j1107d.tunnel.qydev.com/j1107ssmWX/wx/NewFile.jsp");
						item1.setTitle("的双方各");
						
						NewMessageItem item2 = new NewMessageItem();
						item2.setDescription("换个合金快乐就好国际化的是");
						item2.setPicUrl("http://j1107d.tunnel.qydev.com/j1107ssmWX/imgs/p1.png");
						item2.setUrl("http://j1107d.tunnel.qydev.com/j1107ssmWX/wx/NewFile2.jsp");
						item2.setTitle("的说法和");
						
						NewMessageItem item3 = new NewMessageItem();
						item3.setDescription("单刀赴会尽可能很快就会更好");
						item3.setPicUrl("http://j1107d.tunnel.qydev.com/j1107ssmWX/imgs/p2.png");
						item3.setUrl("http://j1107d.tunnel.qydev.com/j1107ssmWX/wx/NewFile3.jsp");
						item3.setTitle("个讽德诵功");
						
						msg.getArticles().add(item1);
						msg.getArticles().add(item2);
						msg.getArticles().add(item3);
						String xml  =wxUtil.toXML(msg);
						System.out.println(xml);
						return  xml;
						
					}else{
						System.out.println(tm.getToUserName() + ":" + tm.getContent());
					}
				

					// 处理超链接消息
				} else if (J1107WXConstants.XML_MSG_LINK.equals(MsgType)) {

					 //处理消息事件
				}else if (J1107WXConstants.XML_MSG_EVENT.equals(MsgType)) {
			 
					EventInMsg event = wxUtil.toBean(doc.asXML(), EventInMsg.class);
					
					if(J1107WXConstants.EVT_CLICK.equals(event.getEvent())){ //点击事件

						if("SEARCH_SCORE".equals(event.getEventKey())){
						
						  //  return wxUtil.replyTextMsg("SEARCH_SCORE成功！", event);
							
							return wxUtil.replyImageMessage("pMZLlVSfCh17X7mm2ds_KljvK3lUnFF5k21yoBGY8IkD9-Ez0JC1s4dG2ezzp_II", event.getToUserName(), event.getFromUserName());
							
							
						}else if("HELP".equals(event.getEventKey())){
							return wxUtil.replyTextMsg("寻求帮助成功！", event);
						}
						
					}else if(J1107WXConstants.EVT_SUBSCRIBE.equals(event.getEvent())){  //关注事件
						//System.out.println(event.getFromUserName()+"关注微信");
						return wxUtil.replyVoiceMessage("kSLdF9Cbo1M_xDf-GVdDgDW4IB-OxSJZc06jlPYRD-nwtIy3wam3TDpF4vVlCquc", event.getToUserName(), event.getFromUserName());

					}else if(J1107WXConstants.EVT_UNSUBSCRIBE.equals(event.getEvent())){  //取消关注
						System.out.println(event.getFromUserName()+"取消关注微信");
					}
				}
			}

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  "err";
	}
	
	
}
