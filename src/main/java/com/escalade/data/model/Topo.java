package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "TOPO")
public class Topo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TOPO_ID")
	private int topoId;

	@Column(name = "UTILISATEUR_ID")
	private String utilisateurId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "NBSITE")
	private int nbSite;

	@Column(name = "NBSECTOR")
	private int nbSector;

	@Column(name = "AVAILABLE")
	private boolean available;

	public Topo() {super();}

	public Topo(int topoId, String utilisateurId, String name, int nbSite, int nbSector, boolean available) {
		this.topoId = topoId;
		this.utilisateurId = utilisateurId;
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

	public String getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(String utilisateurId) {
		this.utilisateurId = utilisateurId;
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
				", utilisateurId='" + utilisateurId + '\'' +
				", name='" + name + '\'' +
				", nbSite=" + nbSite +
				", nbSector=" + nbSector +
				", available=" + available +
				'}';
	}
}