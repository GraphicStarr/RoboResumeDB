package me.jerilynmensah.roboresumedatabase.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SearchEmployee {

    // @Id is necessary even if SearchEmployee is not being used in the db
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String searchEmployee;


    public String getSearchEmployee() {
        return searchEmployee;
    }

    public void setsearchEmployee(String searchEmployee) {
        this.searchEmployee = searchEmployee;
    }


}