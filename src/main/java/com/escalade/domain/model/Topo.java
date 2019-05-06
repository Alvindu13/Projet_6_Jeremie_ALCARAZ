package com.escalade.domain.model;

public class Topo {

	private String userName;
	private String name;
	private int nbSite;
	private int nbSector;
	private boolean available;

	public Topo() {super();}

	public Topo(String userName, String name, int nbSite, int nbSector, boolean available) {
		this.userName = userName;
		this.name = name;
		this.nbSite = nbSite;
		this.nbSector = nbSector;
		this.available = available;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getNbSite() {
		return nbSite;
	}

	public void setNbSite(int nbSite) {
		this.nbSite = nbSite;
	}

	public int getNbSector() {
		return nbSector;
	}

	public void setNbSector(int nbSector) {
		this.nbSector = nbSector;
	}

	public boolean isAvailable() {
		return this.available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}



}