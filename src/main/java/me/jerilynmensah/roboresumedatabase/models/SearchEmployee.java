package me.jerilynmensah.roboresumedatabase.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SearchEmployee {

    // @Id is necessary even if SearchEmployee is not being used in the db
    @Id
    private long id;
    private String searchEmployee;


    public String getSearchEmployee() {
        return searchEmployee;
    }

    public void setsearchEmployee(String searchEmployee) {
        this.searchEmployee = searchEmployee;
    }


}