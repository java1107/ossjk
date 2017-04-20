package com.jkoss.wx.menu;

import java.util.ArrayList;
import java.util.List;
public class WxMenu {
	//最多3个
	private List<WxButton> button = new ArrayList();

	public List<WxButton> getButton() {
		return button;
	}

	public void setButton(List<WxButton> button) {
		this.button = button;
	}
	
}
