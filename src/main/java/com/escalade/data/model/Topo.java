package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "TOPO")
public class Topo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name="topo_id_seq", sequenceName="topo_id_seq", allocationSize=1)
	@Column(name = "TOPO_ID")
	private int topoId;

	@Column(name = "UTILISATEUR_USERNAME")
	private String userName;

	@Column(name = "NAME")
	private String name;

	@Column(name = "NBSITE")
	private int nbSite;

	@Column(name = "NBSECTOR")
	private int nbSector;

	@Column(name = "AVAILABLE")
	private boolean available;

	public Topo() {super();}

	public Topo(int topoId, String userName, String name, int nbSite, int nbSector, boolean available) {
		this.topoId = topoId;
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

	public int getTopoId() {
		return topoId;
	}

	public void setTopoId(int topoId) {
		this.topoId = topoId;
	}

	@Override
	public String toString() {
		return "Topo{" +
				"topoId=" + topoId +
				", userName='" + userName + '\'' +
				", name='" + name + '\'' +
				", nbSite=" + nbSite +
				", nbSector=" + nbSector +
				", available=" + available +
				'}';
	}
}