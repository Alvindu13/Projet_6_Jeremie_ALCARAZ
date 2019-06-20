package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "TOPO")
public class Topo {

	@ManyToOne(optional=false)
	@JoinColumn(name="UTILISATEUR_ID")
	private Utilisateur utilisateur;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TOPO_ID")
	private int topoId;




	@Column(name = "NAME")
	private String name;

	@Column(name = "NBSITE")
	private int nbSite;

	@Column(name = "NBSECTOR")
	private int nbSector;

	@Column(name = "AVAILABLE")
	private Boolean available;



	public Topo() {super();}

	public Topo(Utilisateur utilisateur, String name, int nbSite, int nbSector, Boolean available) {
		this.utilisateur = utilisateur;
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

	/*public int getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(int utilisateurId) {
		this.utilisateurId = utilisateurId;}*/
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

	public Boolean isAvailable() {
		return this.available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public int getTopoId() {
		return topoId;
	}

	public void setTopoId(int topoId) {
		this.topoId = topoId;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Topo{" +
				"topoId=" + topoId +
				", name='" + name + '\'' +
				", nbSite=" + nbSite +
				", nbSector=" + nbSector +
				", available=" + available +
				'}';
	}
}