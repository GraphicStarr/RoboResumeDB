package me.jerilynmensah.roboresumedatabase.repositories;

import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.repository.CrudRepository;

public interface JobRepo extends CrudRepository <Job, Long>{
}
