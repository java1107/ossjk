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
public class WxXmlOutVoiceMessage extends Message {

	public WxXmlOutVoiceMessage() {
		// TODO Auto-generated constructor stub
		// 设定文本类型
		super.setMsgType(J1107WXConstants.XML_MSG_VOICE);
		// 设置创建时间
		super.setCreateTime(new Date().getTime());

	}

	private Voice Voice;

	public class Voice {
		private String MediaId;

		public String getMediaId() {
			return MediaId;
		}

		public void setMediaId(String mediaId) {
			MediaId = mediaId;
		}

	}

	public Voice getVoice() {
		return Voice;
	}

	public void setVoice(Voice voice) {
		Voice = voice;
	}

}
