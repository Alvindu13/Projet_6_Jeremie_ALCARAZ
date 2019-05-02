package com.escalade.model;

import org.springframework.stereotype.Component;

public class Utilisateur {

	private String firstName;
	private String lastName;
	private int nbTopo;
	private String username;
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