package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {


	@Id
	@Column(name = "USERNAME")
	private String username;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "NBTOPO")
	private int nbTopo;

	@Column(name = "PASSWORD")
	private String password;

	public Utilisateur() {
		super();
	}

	public Utilisateur(String firstName, String lastName, int nbTopo, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.nbTopo = nbTopo;
		this.username = username;
		this.password = password;
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

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}