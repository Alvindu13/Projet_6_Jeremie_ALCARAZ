package com.escalade.data.model;

import com.escalade.data.model.Secteur;

import javax.persistence.*;

@Entity
@Table(name = "VOIE")
public class Voie {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "VOIE_ID")
	private int voieId;

	@Column(name = "SECTEUR_ID")
	private int secteurId;

	@Column(name = "SIZE")
	private double size;

	@Column(name = "NAME")
	private String name;

	//cotation, difficulté de la voie
	@Column(name = "LEVEL")
	private String level;

	@Column(name = "NBPOINTS")
	private int nbPoints;

	@Column(name = "NBPART")
	private int nbPart;

	public Voie() { super();};

	public Voie(int secteurId, double size, String level, int nbPoints, int nbPart, String name) {
		this.secteurId = secteurId;
		this.size = size;
		this.level = level;
		this.nbPoints = nbPoints;
		this.nbPart = nbPart;
		this.name = name;
	}


	public int getSecteurId() {
		return secteurId;
	}

	public void setSecteurId(int secteurId) {
		this.secteurId = secteurId;
	}

	public int getVoieId() {
		return voieId;
	}

	public void setVoieId(int voieId) {
		this.voieId = voieId;
	}


	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getNbPoints() {
		return nbPoints;
	}

	public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}

	public int getNbPart() {
		return nbPart;
	}

	public void setNbPart(int nbPart) {
		this.nbPart = nbPart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}