package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

//needs @Entity annotation because it is referencing the AbstractEntity
@Entity
public class Employer extends AbstractEntity {

    //Start Part 3: Within Employer, add a private property jobs of type List<Job> and initialize it to an empty ArrayList.
    // After we set up the Job class to work with Employer objects, this list will represent the list of all
    // items in a given job. We’ll do this in a bit.
    //Use the @OneToMany and @JoinColumn annotations on the jobs list in Employer to declare the relationship
    // between data tables.
    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    @NotBlank
    //add validation
    @Size(message = "Location must be between 2 and 250 characters.", min = 2, max = 250)
    //add string field for location
    private String location;

    //Add getter and setter
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    //no arguments constructor required for hibernate to create an object
    public Employer() {}
}
