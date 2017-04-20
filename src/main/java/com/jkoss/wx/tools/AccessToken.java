package com.jkoss.wx.tools;

import java.io.Serializable;


//access_token是公众号的全局唯一票据，公众号调用各接口时都需使用access_token。 
public class AccessToken implements Serializable {
 //json   <-----> AccessToken
	
	private  String access_token;
	private  long expires_in;
	private  int errcode;
	private  String errmsg;
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public long getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(long expires_in) {
		this.expires_in = expires_in;
	}
	public int getErrcode() {
		return errcode;
	}
	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}
	public String getErrmsg() {
		return errmsg;
	}
	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}
	
	
	
	
	
}
