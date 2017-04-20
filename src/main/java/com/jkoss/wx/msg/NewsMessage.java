package com.jkoss.wx.msg;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("xml")       //回复图文消息
public class NewsMessage extends Message {

	private Integer ArticleCount;
	
	private List<NewMessageItem>  Articles = new ArrayList();
	
 

	public Integer getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(Integer articleCount) {
		ArticleCount = articleCount;
	}

	public List<NewMessageItem> getArticles() {
		return Articles;
	}

	public void setArticles(List<NewMessageItem> articles) {
		Articles = articles;
	}
	
	
	
}
