package com.escalade.data.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "UTILISATEUR")
public class Utilisateur {


	/*@OneToMany(mappedBy = "utilisateur")
	private List<Topo> topos = new ArrayList<Topo>();*/

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "UTILISATEUR_ID")
	private int utilisateurId;

	@Column(name = "USERNAME")
	private String userName;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ENABLED")
	private Integer enabled;

	/*@OneToMany(mappedBy = "UTILISATEUR", cascade = CascadeType.ALL)
	private Set<TopoDocument> userDocuments = new HashSet<TopoDocument>();*/

	public Utilisateur() {
		super();
	}


	public Utilisateur(String userName, String firstName, String lastName, String password, Integer enabled) {
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public int getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(int utilisateurId) {
		this.utilisateurId = utilisateurId;
	}



	@Override
	public String toString() {
		return "Utilisateur{" +
				"utilisateurId=" + utilisateurId +
				", userName='" + userName + '\'' +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", password='" + password + '\'' +
				", enabled=" + enabled +
				'}';
	}
}