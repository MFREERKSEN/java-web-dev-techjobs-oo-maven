package com.company;

import java.util.Objects;

public class Job {
    private static int nextId = 1;

    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field
    public Job() {
        id = nextId;
        nextId++;
    }


    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.
    @Override
    public String toString() {
//        System.out.println(this.getLocation());
//        System.out.println(location);

        if (this.getName() == null && this.getEmployer()== null && this.getLocation() == null
                && this.getPositionType() == null && this.getCoreCompetency() == null){
            return ("OOPS! This job does not seem to exist.");
        }

        if (this.getName() == "") {
            this.name = ("Data not available");
        } else if (this.getEmployer().toString() == "") {
            this.employer.setValue("Data not available");
        } else if (this.getLocation().toString() == "") {
            this.location.setValue("Data not available");
        } else if (this.getPositionType().toString() == "") {
            this.positionType.setValue("Data not available");
        } else if (this.getCoreCompetency().toString() == "") {
            this.coreCompetency.setValue("Data not available");
        }
        return "\n" + "ID: " + this.getId() + "\nName: " + getName() + "\nEmployer: " + this.getEmployer() +
                "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + getCoreCompetency() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }


}
