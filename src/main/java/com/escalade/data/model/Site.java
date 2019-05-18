package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "SITE")
public class Site {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "SITE_ID")
    private int siteId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "TOPO_ID")
    private int topoId;

    @Column(name = "NBSECTOR")
    private int nbSector;

    @Column(name = "NBWAY")
    private int nbWay;

    @Column(name = "COTATION")
    private String cotation;

    @Column(name = "WAY_SIZE")
    private Double waySize;


    public Site() {super(); }

    public Site(String name, String location, String comment, int topoId, int nbSector, int nbWay, String cotation, Double waySize) {
        this.name = name;
        this.location = location;
        this.comment = comment;
        this.topoId = topoId;
        this.nbSector = nbSector;
        this.nbWay = nbWay;
        this.cotation = cotation;
        this.waySize = waySize;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getTopoId() {
        return topoId;
    }

    public void setTopoId(int topoId) {
        this.topoId = topoId;
    }

    public int getNbSector() {
        return nbSector;
    }

    public void setNbSector(int nbSector) {
        this.nbSector = nbSector;
    }

    public int getNbWay() {
        return nbWay;
    }

    public void setNbWay(int nbWay) {
        this.nbWay = nbWay;
    }

    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) {
        this.cotation = cotation;
    }

    public Double getWaySize() {
        return waySize;
    }

    public void setWaySize(Double waySize) {
        this.waySize = waySize;
    }
}
