package com.jkoss.wx.msg;

import java.util.Date;

import com.jkoss.wx.tools.J1107WXConstants;
import com.thoughtworks.xstream.annotations.XStreamAlias;
/**
 * 响应图片类
 * 
 * @author Rick
 * 
 */
@XStreamAlias("xml")
public class WxXmlOutImageMessage extends Message {

	public WxXmlOutImageMessage() {
		// TODO Auto-generated constructor stub
		// 设定文本类型
		super.setMsgType(J1107WXConstants.XML_MSG_IMAGE);
		// 设置创建时间
		super.setCreateTime(new Date().getTime());

	}

	private Image Image;

	public class Image {
		private String MediaId;

		public String getMediaId() {
			return MediaId;
		}

		public void setMediaId(String mediaId) {
			MediaId = mediaId;
		}

	}

	public Image getImage() {
		return Image;
	}

	public void setImage(Image image) {
		Image = image;
	}

}
