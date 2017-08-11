package me.jerilynmensah.roboresumedatabase.models;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmployeeList {

    @Id
    private long id;

    @NotNull
    @Size(min=3, max=50)

    private String employeeOne;
    private String jobEmployee;

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

}



