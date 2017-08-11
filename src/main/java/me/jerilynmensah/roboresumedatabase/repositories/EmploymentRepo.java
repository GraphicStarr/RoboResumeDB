package me.jerilynmensah.roboresumedatabase.repositories;

import me.jerilynmensah.roboresumedatabase.controllers.Employment;
import me.jerilynmensah.roboresumedatabase.models.EmployeeList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmploymentRepo extends CrudRepository <Employment, Long>{

    List<EmployeeList> findEmployeeOneContaining(String s);


}
