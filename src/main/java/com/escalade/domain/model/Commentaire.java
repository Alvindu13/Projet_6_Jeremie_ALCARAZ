package com.escalade.domain.model;

public class Commentaire {

	private String content;
	private String userName;
	private int commentaire_id;


	public Commentaire() { super(); }

	public Commentaire(String content, String userName, int commentaire_id) {
		this.content = content;
		this.userName = userName;
		this.commentaire_id = commentaire_id;
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


	public int getId() {
		return commentaire_id;
	}

	public void setId(int commentaire_id) {
		this.commentaire_id = commentaire_id;
	}

	@Override
	public String toString() {
		return "Commentaire{" +
				"content='" + content + '\'' +
				", userName='" + userName + '\'' +
				'}';
	}
}