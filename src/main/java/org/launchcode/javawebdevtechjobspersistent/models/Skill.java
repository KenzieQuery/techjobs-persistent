package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

//needs @Entity annotation because it is referencing the AbstractEntity
@Entity
public class Skill extends AbstractEntity {
    //validation added to require description and limit response length.
    @NotBlank
    @Size(message = "Please make response 5 to 250 characters long.",min = 5, max = 250)
    //field added for longer description of skill
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs;

    //add getter and setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() { return jobs; }

    public void setJobs(List<Job> jobs) { this.jobs = jobs; }

    // add empty argument so hibernate can create object.
    public Skill() {}
}
