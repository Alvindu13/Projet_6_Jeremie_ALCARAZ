package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "VOIE")
public class Voie {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "VOIE_ID")
	private int voieId;

	/*@Column(name = "SECTEUR_ID")
	private int secteurId;*/

	@ManyToOne
	@JoinColumn(name = "SECTEUR_ID")
	private Secteur secteur;

	@Column(name = "SIZE")
	private double size;

	@Column(name = "NAME")
	private String name;

	//cotation, difficulté de la voie
	@Column(name = "COTATION")
	private String cotation;

	@Column(name = "NBPOINTS")
	private int nbPoints;

	@Column(name = "NBPART")
	private int nbPart;

	public Voie() { super();};

	public Voie(Secteur secteur, double size, String name, String cotation, int nbPoints, int nbPart) {
		this.secteur = secteur;
		this.size = size;
		this.name = name;
		this.cotation = cotation;
		this.nbPoints = nbPoints;
		this.nbPart = nbPart;
	}

	public Secteur getSecteur() {
		return secteur;
	}

	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
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

	public String getCotation() {
		return cotation;
	}

	public void setCotation(String cotation) {
		this.cotation = cotation;
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