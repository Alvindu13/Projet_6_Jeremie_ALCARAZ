package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {


	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "utilisateur_id")
	private int utilisateurId;

	@Column(name = "USERNAME")
	private String userName;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "NBTOPO")
	private int nbTopo;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ENABLED")
	private Integer enabled;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String userName, String firstName, String lastName, int nbTopo, String password, Integer enabled) {
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nbTopo = nbTopo;
		this.password = password;
		this.enabled = enabled;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNbTopo() {
		return nbTopo;
	}

	public void setNbTopo(int nbTopo) {
		this.nbTopo = nbTopo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
}