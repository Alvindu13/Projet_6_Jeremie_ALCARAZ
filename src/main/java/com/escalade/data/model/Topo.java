package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "TOPO")
public class Topo  {



	@ManyToOne(optional=false)
	@JoinColumn(name="UTILISATEUR_ID")
	private Utilisateur utilisateur;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TOPO_ID")
	private int topoId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "CURRENTLY_USER_ID")
	private Integer userCurrentProprio;

	@Column(name = "AVAILABLE")
	private Boolean available;

	@Column(name = "RESERVE")
	private Boolean reserve;


	public Topo() {}

	public Topo(Utilisateur utilisateur, String name, Integer userCurrentProprio, Boolean available, Boolean reserve) {
		this.utilisateur = utilisateur;
		this.name = name;
		this.userCurrentProprio = userCurrentProprio;
		this.available = available;
		this.reserve = reserve;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Boolean getAvailable() {
		return available;
	}

	public Boolean getReserve() {
		return reserve;
	}

	public void setReserve(Boolean reserve) {
		this.reserve = reserve;
	}

	public Integer getUserCurrentProprio() {
		return userCurrentProprio;
	}

	public void setUserCurrentProprio(Integer userCurrentProprio) {
		this.userCurrentProprio = userCurrentProprio;
	}


	@Override
	public String toString() {
		return "Topo{" +
				"utilisateur=" + utilisateur +
				", topoId=" + topoId +
				", name='" + name + '\'' +
				", userCurrentProprio=" + userCurrentProprio +
				", available=" + available +
				", reserve=" + reserve +
				'}';
	}
}