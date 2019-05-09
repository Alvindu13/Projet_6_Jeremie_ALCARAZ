package com.escalade.domain.model;

public class Site {

    private String name;
    private String location;
    private String comment;

    public Site() {super(); }

    public Site(String name, String location, String comment) {
        this.name = name;
        this.location = location;
        this.comment = comment;
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
}
