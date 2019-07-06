package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "LENGTH")
public class Length {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "LENGTH_ID")
    private int lengthID;

    @Column(name = "SIZE")
    private double size;

    @Column(name = "RELAYNAME")
    private String relayName;

    public Length(double size, String relayName) {
        this.size = size;
        this.relayName = relayName;
    }

    public int getLengthID() {
        return lengthID;
    }

    public void setLengthID(int lengthID) {
        this.lengthID = lengthID;
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
