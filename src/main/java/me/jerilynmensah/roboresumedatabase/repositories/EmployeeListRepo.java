package me.jerilynmensah.roboresumedatabase.repositories;

import me.jerilynmensah.roboresumedatabase.models.EmployeeList;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeListRepo extends CrudRepository <EmployeeList, Long>{

    List<EmployeeList> findEmployeeOneContaining(String s);


}
