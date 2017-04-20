package com.jkoss.wx.tools;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Component;

import com.jkoss.wx.msg.Message;
import com.jkoss.wx.msg.NewMessageItem;
import com.jkoss.wx.msg.NewsMessage;
import com.jkoss.wx.msg.TextMessage;
import com.jkoss.wx.msg.WxXmlOutImageMessage;
import com.jkoss.wx.msg.WxXmlOutVoiceMessage;
import com.jkoss.wx.msg.WxXmlOutImageMessage.Image;
import com.jkoss.wx.msg.WxXmlOutVoiceMessage.Voice;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

@Component
public class WXMessageUTIL {

	//真实性校验
	public String checkSignature(HttpServletRequest request){
		
	    String signature =	request.getParameter("signature");
	    String timestamp =	request.getParameter("timestamp");
	    String nonce =	request.getParameter("nonce");
	    String echostr =	request.getParameter("echostr");
	    
		if(signature!=null){
		//1. 将token、timestamp、nonce三个参数进行字典序排序
				String[] arrs = {J1107WXConstants.Token,timestamp,nonce};
				
				//字典序排序
				Arrays.sort(arrs);
				
				//2. 将三个参数字符串拼接成一个字符串
				String tempStr ="";
				for (String string : arrs) {
					tempStr+=string;
				}
				//进行sha1加密
				tempStr = EncoderHandler.encode("SHA1", tempStr);

				//3. 开发者获得加密后的字符串可与signature对比，标识该请求来源于微信
				return signature.equals(tempStr)?echostr:"";
		}
		return "";
	}
	
	//xml--->map
	public Map xmlToMap(HttpServletRequest request){
		Map<String,String> textMsg = null;
		SAXReader saxReader  = new SAXReader();
		try {
			Document  doc = saxReader.read(request.getInputStream());
			//System.out.println(doc.asXML());
			Element root = doc.getRootElement();
			List<Element>  elments = 	root.elements();
			textMsg = new HashMap();
			for (Element element : elments) {
				textMsg.put(element.getName(), element.getText());
			}

		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
		return textMsg;
	}
	
	//xml--->bean
	public <T> T toBean(String xmlStr,Class<T> cls){
		XStream stm = new XStream(new DomDriver("utf-8"));
		stm.processAnnotations(cls);   //如果entity中有元数据配置的映射，必须执行
		return (T)stm.fromXML(xmlStr);
	}
	
	 public String  toXML(Object obj){
		 XStream stm = new XStream(new DomDriver("utf-8"));
		 stm.processAnnotations(obj.getClass());   
		 return stm.toXML(obj);
	 }

	 public String replyTextMsg(String content,Message  msg){
			TextMessage   tmsg = new TextMessage();
			
			tmsg.setToUserName(msg.getFromUserName());
			tmsg.setFromUserName(msg.getToUserName());
			tmsg.setCreateTime(new Date().getTime());
			
			tmsg.setMsgType(J1107WXConstants.XML_MSG_TEXT);
			tmsg.setContent(content);
			return  toXML(tmsg);
	 }
	 
	 public   String replyNewsMessage(List<NewMessageItem> Articles, String ToUserName,
				String FromUserName) {
			// 构造一个对象
		    NewsMessage newsMessage = new NewsMessage();

			newsMessage.setToUserName(FromUserName);
			newsMessage.setFromUserName(ToUserName);
			newsMessage.setArticleCount(Articles.size());
			newsMessage.setArticles(Articles);

			return toXML(newsMessage);
		}
	 
	 
	 public   String replyImageMessage(String MediaId, String ToUserName,
				String FromUserName) {

		    WxXmlOutImageMessage imageMessage = new WxXmlOutImageMessage();
			imageMessage.setFromUserName(ToUserName);
			imageMessage.setToUserName(FromUserName);

			Image image = imageMessage.new Image();

			image.setMediaId(MediaId);

			imageMessage.setImage(image);

			return toXML(imageMessage);
		}

	 
	 public   String replyVoiceMessage(String MediaId, String ToUserName,
				String FromUserName) {

			WxXmlOutVoiceMessage voiceMessage = new WxXmlOutVoiceMessage();
			voiceMessage.setFromUserName(ToUserName);
			voiceMessage.setToUserName(FromUserName);

			Voice voice = voiceMessage.new Voice();

			voice.setMediaId(MediaId);

			voiceMessage.setVoice(voice);

			return toXML(voiceMessage);
		}

	 
	
}
