package com.qyspeed.domain;

import java.sql.Timestamp;

/*
 * ��̬���ű�  news �־ö�����
 */
public class News {

	private int newsid;
	private String newsTitle;
	private String newsContent;
	private Timestamp newsDate;
	private String newsphoto;
	
	public int getNewsid() {
		return newsid;
	}
	public void setNewsid(int newsid) {
		this.newsid = newsid;
	}
	public String getNewsTitle() {
		return newsTitle;
	}
	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}
	public String getNewsContent() {
		return newsContent;
	}
	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}
	public Timestamp getNewsDate() {
		return newsDate;
	}
	public void setNewsDate(Timestamp newsDate) {
		this.newsDate = newsDate;
	}
	public String getNewsphoto() {
		return newsphoto;
	}
	public void setNewsphoto(String newsphoto) {
		this.newsphoto = newsphoto;
	}
	
}
