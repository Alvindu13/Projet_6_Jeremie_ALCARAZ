package com.escalade.data.model;

import com.escalade.data.model.Secteur;

import javax.persistence.*;

@Entity
@Table(name = "VOIE")
public class Voie {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "VOIE_ID")
	private int voieID;

	@Column(name = "SECTEUR_ID")
	private int secteurID;

	@Column(name = "SIZE")
	private double size;

	//cotation, difficulté de la voie
	@Column(name = "LEVEL")
	private int level;

	@Column(name = "NBPOINTS")
	private int nbPoints;

	@Column(name = "NBPART")
	private int nbPart;

	public Voie(int secteurID, double size, int level, int nbPoints, int nbPart) {
		this.secteurID = secteurID;
		this.size = size;
		this.level = level;
		this.nbPoints = nbPoints;
		this.nbPart = nbPart;
	}


	public int getSecteurID() {
		return secteurID;
	}

	public void setSecteurID(int secteurID) {
		this.secteurID = secteurID;
	}

	public int getVoieID() {
		return voieID;
	}

	public void setVoieID(int voieID) {
		this.voieID = voieID;
	}


	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
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
}