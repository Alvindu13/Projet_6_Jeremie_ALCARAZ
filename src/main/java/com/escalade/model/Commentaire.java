package com.escalade.model;

public class Commentaire {

	private String content;
	private String userName;


	public Commentaire(String content) {
		this.content = content;
	}

	public Commentaire() { super(); }

	public Commentaire(String content, String userName) {
		this.content = content;
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}