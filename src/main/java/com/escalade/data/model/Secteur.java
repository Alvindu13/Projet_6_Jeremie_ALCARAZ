package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "SECTEUR")
public class Secteur {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "SECTEUR_ID")
    private int secteurId;

    /*@Column(name = "SITE_ID")
    private int siteId;*/

    @ManyToOne
    @JoinColumn(name = "SITE_ID")
    private Site site;


    @Column(name = "NAME")
    private String name;

    public Secteur() {}


    public Secteur(Site site, String name) {
        this.site = site;
        this.name = name;
    }

    public int getSecteurId() {
        return secteurId;
    }

    public void setSecteurId(int secteurId) {
        this.secteurId = secteurId;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
