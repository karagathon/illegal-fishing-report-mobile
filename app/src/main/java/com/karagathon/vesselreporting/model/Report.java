package com.karagathon.vesselreporting.model;

import java.util.Date;

public class Report {

    private String id;
    private String name;
    private String location;
    private String description;
    private Date date;

    public Report(String id, String name, String location, String description, Date date) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.date = date;
    }

    public Report() {

    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }


    public String getDescription() {
        return description;
    }


    public Date getDate() {
        return date;
    }

}
