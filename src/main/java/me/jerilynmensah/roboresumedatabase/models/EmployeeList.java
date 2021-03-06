package me.jerilynmensah.roboresumedatabase.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EmployeeList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=3, max=50)
    private String employeeOne;
    @NotNull
    @Size(min=3, max=50)
    private String jobEmployee;
    @NotNull
    @Size(min=3, max=50)
    private String employeeList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmployeeOne() {
        return employeeOne;
    }

    public void setEmployeeOne(String employeeOne) {
        this.employeeOne = employeeOne;
    }

    public String getJobEmployee() {
        return jobEmployee;
    }

    public void setJobEmployee(String jobEmployee) {
        this.jobEmployee = jobEmployee;
    }

    public String getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(String employeeList) {
        this.employeeList = employeeList;
    }


    public String getFirstName() {
    }

    public String getLastName() {
    }
}



