package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//needs @Entity annotation because it is referencing the AbstractEntity
@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    //add validation
    @Size(message = "Location must be between 52and 250 characters.", min = 2, max = 250)
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
