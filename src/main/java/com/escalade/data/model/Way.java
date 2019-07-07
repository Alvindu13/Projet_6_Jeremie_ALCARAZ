package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "way")
public class Way {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "way_id")
	private int wayId;

	@Column(name = "sector_id")
	private int sectorId;

	@Column(name = "size")
	private double size;

	@Column(name = "name")
	private String name;

	//cotation, difficulté de la voie
	@Column(name = "cotation")
	private String cotation;

	@Column(name = "nb_points")
	private int nbPoints;

	@Column(name = "nb_part")
	private int nbPart;

	public Way() {}

	public Way(int sectorId, double size, String name, String cotation, int nbPoints, int nbPart) {
		this.sectorId = sectorId;
		this.size = size;
		this.name = name;
		this.cotation = cotation;
		this.nbPoints = nbPoints;
		this.nbPart = nbPart;
	}

	public int getWayId() {
		return wayId;
	}

	public void setWayId(int wayId) {
		this.wayId = wayId;
	}

	public int getSectorId() {
		return sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}