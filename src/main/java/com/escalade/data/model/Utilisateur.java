package com.escalade.data.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

	@Column(name = "NBTOPO")
	private int nbTopo;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ENABLED")
	private Integer enabled;

	public Utilisateur() {
		super();
	}

	/*public Utilisateur(List<Topo> topos, String userName, String firstName, String lastName, int nbTopo, String password, Integer enabled) {
		this.topos = topos;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nbTopo = nbTopo;
		this.password = password;
		this.enabled = enabled;
	}*/

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
				", nbTopo=" + nbTopo +
				", password='" + password + '\'' +
				", enabled=" + enabled +
				'}';
	}
}