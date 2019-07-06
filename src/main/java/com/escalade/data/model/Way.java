package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "way")
public class Way {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "way_ID")
	private int wayId;

	/*@Column(name = "sector_ID")
	private int sectorId;*/

	@ManyToOne
	@JoinColumn(name = "sector_ID")
	private Sector sector;

	@Column(name = "SIZE")
	private double size;

	@Column(name = "NAME")
	private String name;

	//cotation, difficulté de la way
	@Column(name = "COTATION")
	private String cotation;

	@Column(name = "nb_points")
	private int nbPoints;

	@Column(name = "nb_part")
	private int nbPart;

	public Way() { super();};

	public Way(Sector sector, double size, String name, String cotation, int nbPoints, int nbPart) {
		this.sector = sector;
		this.size = size;
		this.name = name;
		this.cotation = cotation;
		this.nbPoints = nbPoints;
		this.nbPart = nbPart;
	}

	public Sector getsector() {
		return sector;
	}

	public void setsector(Sector sector) {
		this.sector = sector;
	}

	public int getwayId() {
		return wayId;
	}

	public void setwayId(int wayId) {
		this.wayId = wayId;
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