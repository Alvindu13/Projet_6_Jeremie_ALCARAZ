package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "SECTEUR")
public class Secteur {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "SECTEUR_ID")
    private String secteurId;

    @Column(name = "SITE_ID")
    private String siteId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NBWAY")
    private int nbWay;

    public Secteur() {super(); }


    public Secteur(String siteId, String name, int nbWay) {
        this.siteId = siteId;
        this.name = name;
        this.nbWay = nbWay;
    }

    public String getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(String secteurId) {
        this.secteurId = secteurId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteID(String siteID) {
        this.siteId = siteId;
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
