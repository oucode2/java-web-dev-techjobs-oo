package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private static int id;
    private static int nextId = 1;

    private static String name;
    private static Employer employer;
    private static Location location;
    private static PositionType positionType;
    private static CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency ) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(name, job.name) &&
                Objects.equals(employer, job.employer) &&
                Objects.equals(location, job.location) &&
                Objects.equals(positionType, job.positionType) &&
                Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

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

    public String toString() {
        if (Job.employer.getValue() == "") {
            Job.employer.setValue("Data not available");
        }
        else if (Job.location.getValue() == "") {
            Job.location.setValue("Data not available");
        }
        else if (Job.positionType.getValue() == "") {
            Job.positionType.setValue("Data not available");
        }
        else if (Job.coreCompetency.getValue() == "") {
            Job.coreCompetency.setValue("Data not available");
        }

        return ("\r\n" + "ID: " + Job.id + "\r\n" + "Name: " + Job.name + "\r\n" + "Employer: " + Job.employer + "\r\n" + "Location: " + Job.location + "\r\n" + "Position Type: " + Job.positionType + "\r\n" + "Core Competency: " + Job.coreCompetency + "\r\n");
    }
}
