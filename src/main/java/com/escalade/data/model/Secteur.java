package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "SECTEUR")
public class Secteur {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "SECTEUR_ID")
    private int secteurId;

    @Column(name = "SITE_ID")
    private int siteId;

    @Column(name = "NAME")
    private String name;

    public Secteur() {}


    public Secteur(int siteId, String name) {
        this.siteId = siteId;
        this.name = name;
    }


    public int getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(int secteurId) {
        this.secteurId = secteurId;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
