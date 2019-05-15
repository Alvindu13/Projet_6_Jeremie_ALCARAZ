package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "SECTEUR")
public class Secteur {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "SECTEUR_ID")
    private String secteurID;

    @Column(name = "SITE_ID")
    private String siteID;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NBWAY")
    private int nbWay;

    public Secteur(String siteID, String name, int nbWay) {
        this.siteID = siteID;
        this.name = name;
        this.nbWay = nbWay;
    }

    public String getSecteurID() {
        return secteurID;
    }

    public void setSecteurID(String secteurID) {
        this.secteurID = secteurID;
    }

    public String getSiteID() {
        return siteID;
    }

    public void setSiteID(String siteID) {
        this.siteID = siteID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbWay() {
        return nbWay;
    }

    public void setNbWay(int nbWay) {
        this.nbWay = nbWay;
    }
}
