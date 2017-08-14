package me.jerilynmensah.roboresumedatabase.repositories;

import me.jerilynmensah.roboresumedatabase.models.EmployeeList;
import me.jerilynmensah.roboresumedatabase.models.Person;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepo extends CrudRepository <Person, Long>{

    List<EmployeeList> findEmployeeOneContaining(String s);


    List<Person> findPersonContaining(String searchEmployee);
}
