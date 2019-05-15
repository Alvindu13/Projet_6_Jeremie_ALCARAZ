package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "COMMENTAIRE")
public class Commentaire {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "COMMENTAIRE_ID")
	private int commentaireId;


	@Column(name = "CONTENT")
	private String content;

	@Column(name = "UTILISATEUR_USERNAME")
	private String userName;

	@Column(name = "TOPO_ID")
	private int topoId;

	public Commentaire() { super(); }

	public Commentaire(String content, String userName, int commentaireId, int topoId) {
		this.content = content;
		this.userName = userName;
		this.commentaireId = commentaireId;
		this.topoId = topoId;
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

	public int getTopoId() {
		return topoId;
	}

	public void setTopoId(int topoId) {
		this.topoId = topoId;
	}

	@Override
	public String toString() {
		return "Commentaire{" +
				"content='" + content + '\'' +
				", userName='" + userName + '\'' +
				", commentaireId=" + commentaireId +
				", topoId=" + topoId +
				'}';
	}
}