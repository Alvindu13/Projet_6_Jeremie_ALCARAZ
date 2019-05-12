package com.escalade.domain.model;

public class Site {

    private String name;
    private String location;
    private String comment;
    private int topo_id;


    public Site() {super(); }


    public Site(String name, String location, String comment, int topo_id) {
        this.name = name;
        this.location = location;
        this.comment = comment;
        this.topo_id = topo_id;
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

    public int getTopo_id() {
        return topo_id;
    }

    public void setTopo_id(int topo_id) {
        this.topo_id = topo_id;
    }
}
