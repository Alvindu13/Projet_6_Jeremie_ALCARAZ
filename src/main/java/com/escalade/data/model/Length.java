package com.escalade.data.model;

import javax.persistence.*;

@Entity
@Table(name = "length")
public class Length {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "length_id")
    private int lengthId;

    @Column(name = "way_id")
    private int wayId;

    @Column(name = "relay_name")
    private String relayName;

    public Length() {
    }

    public Length(int wayId, String relayName) {
        this.wayId = wayId;
        this.relayName = relayName;
    }

    public int getLengthId() {
        return lengthId;
    }

    public void setLengthID(int lengthId) {
        this.lengthId = lengthId;
    }

    public int getWayId() {
        return wayId;
    }

    public void setWayId(int wayId) {
        this.wayId = wayId;
    }

    public String getRelayName() {
        return relayName;
    }

    public void setRelayName(String relayName) {
        this.relayName = relayName;
    }
}
