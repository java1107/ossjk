package com.jkoss.wx.menu;

import java.util.List;

//Button的父类
public class WxButton {
	
	private String name;
	private String type;
	
	//最多5个
	private List<WxButton>  sub_button;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<WxButton> getSub_button() {
		return sub_button;
	}
	public void setSub_button(List<WxButton> sub_button) {
		this.sub_button = sub_button;
	}

	
	
}
