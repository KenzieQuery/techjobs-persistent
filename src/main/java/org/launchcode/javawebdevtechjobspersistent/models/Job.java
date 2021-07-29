package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Job extends AbstractEntity{

    //Not needed because moved to AbstractEntity
//    @Id
//    @GeneratedValue
//    @Size(min=1, max=250, message = "ID must be between 1 and 250 characters")
//    private int id;

    @Size(min=2, max=250, message = "Name must be between 2 and 250 characters")
    private String name;

    @Size(min=2, max=250, message = "Employer must be between 2 and 250 characters")
    private String employer;

    @Size(min=2, max=250, message = "Description must be between 2 and 250 characters")
    private String skills;

    public Job() {
    }

    public Job(String anEmployer, String someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
