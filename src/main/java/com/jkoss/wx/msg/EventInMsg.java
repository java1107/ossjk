package com.jkoss.wx.msg;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml") 
public class EventInMsg extends Message {
	
	private String  Event;
	private String  EventKey;
	
	public String getEvent() {
		return Event;
	}
	public void setEvent(String event) {
		Event = event;
	}
	public String getEventKey() {
		return EventKey;
	}
	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}
	
	
}
