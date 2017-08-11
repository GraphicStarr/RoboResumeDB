package me.jerilynmensah.roboresumedatabase.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class JobEmployment {

    @NotNull
    @Size(min=3,max=50)
    private String education;
    @NotNull
    @Size(min=3,max=50)
    private String experience;
    @NotNull
    @Size(min=3,max=50)
    private String skill;

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
