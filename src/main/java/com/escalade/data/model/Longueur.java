package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "LONGUEUR")
public class Longueur {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "LONGUEUR_ID")
    private int longueurID;

    @Column(name = "SIZE")
    private double size;

    @Column(name = "RELAYNAME")
    private String relayName;

    public Longueur(double size, String relayName) {
        this.size = size;
        this.relayName = relayName;
    }

    public int getLongueurID() {
        return longueurID;
    }

    public void setLongueurID(int longueurID) {
        this.longueurID = longueurID;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getRelayName() {
        return relayName;
    }

    public void setRelayName(String relayName) {
        this.relayName = relayName;
    }
}
