package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    @Override
    public String toString() {

        if ((name == "Data not available") &&
                (this.employer.getValue() == "Data not available") &&
                (this.location.getValue() == "Data not available") &&
                (this.positionType.getValue() == "Data not available") &&
                (this.coreCompetency.getValue() == "Data not available"))
            return "\n" + "ID: " + id + "\n" + "OOPS! This job does not seem to exist." + "\n";

//        if ((name == null || name == "") &&
//                (this.employer.getValue() == null || this.employer.getValue() == "") &&
//                (this.location.getValue() == null || this.location.getValue() == "") &&
//                (this.positionType.getValue() == null || this.positionType.getValue() == "") &&
//                (this.coreCompetency.getValue() == null || this.coreCompetency.getValue() == ""))
//                 return "\n" + "ID: " + id + "\n" + "OOPS! This job does not seem to exist." + "\n";

        if (name == null || name == "") this.name = "Data not available";
        if (this.employer.getValue() == null || this.employer.getValue() == "") this.employer.setValue("Data not available");
        if (this.location.getValue() == null || this.location.getValue() == "") this.location.setValue("Data not available");
        if (this.positionType.getValue() == null || this.positionType.getValue() == "") this.positionType.setValue("Data not available");
        if (this.coreCompetency.getValue() == null || this.coreCompetency.getValue() == "") this.coreCompetency.setValue("Data not available");

        return "\n" + "ID: " + id +
                "\n" + "Name: " + name +
                "\n" + "Employer: " + employer +
                "\n" + "Location: " + location +
                "\n" + "Position Type: " + positionType +
                "\n" + "Core Competency: " + coreCompetency +
                "\n";
    }

}
