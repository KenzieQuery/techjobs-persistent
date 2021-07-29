package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//needs @Entity annotation because it is referencing the AbstractEntity
@Entity
public class Skill extends AbstractEntity {
    //validation added to require description and limit response length.
    @NotBlank
    @Size(message = "Too many Characters.", max = 250)
    //field added for longer description of skill
    private String description;

    //add getter and setter
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // add empty argument so hibernate can create object.
    public Skill() {}
}
