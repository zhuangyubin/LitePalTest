package com.example.litepaltest.model;

import android.provider.ContactsContract.Contacts.Data;

public class News {

	private int id;
	private String title;
	private String content;
	private Data publishData;
	public int count;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Data getPublishData() {
		return publishData;
	}
	public void setPublishData(Data publishData) {
		this.publishData = publishData;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
