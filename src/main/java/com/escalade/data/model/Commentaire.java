package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "COMMENTAIRE")
public class Commentaire {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "COMMENTAIRE_ID")
	private int commentaireId;


	@Column(name = "CONTENT")
	private String content;

	@Column(name = "UTILISATEUR_USERNAME")
	private String userName;

	@Column(name = "SITE_ID")
	private int siteId;


	public Commentaire() { super(); }

	public Commentaire(String content, String userName, int siteId, int topoId) {
		this.content = content;
		this.userName = userName;
		this.siteId = siteId;
		//this.topoId = topoId;
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
		return commentaireId;
	}

	public void setId(int commentaire_id) {
		this.commentaireId = commentaire_id;
	}

	public int getCommentaireId() {
		return commentaireId;
	}

	public void setCommentaireId(int commentaireId) {
		this.commentaireId = commentaireId;
	}

	/*public int getTopoId() {
		return topoId;
	}

	public void setTopoId(int topoId) {
		this.topoId = topoId;
	}*/

	public int getSiteId() {
		return siteId;
	}

	public void setSiteId(int siteId) {
		this.siteId = siteId;
	}

	@Override
	public String toString() {
		return "Commentaire{" +
				"commentaireId=" + commentaireId +
				", content='" + content + '\'' +
				", userName='" + userName + '\'' +
				", siteId=" + siteId +
				'}';
	}
}