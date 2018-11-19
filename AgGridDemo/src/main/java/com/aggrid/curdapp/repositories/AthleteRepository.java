package com.aggrid.curdapp.repositories;
import org.springframework.data.repository.CrudRepository;

import com.aggrid.curdapp.model.Athlete;

public interface AthleteRepository extends CrudRepository<Athlete, Long> {
    Athlete findByName(String name);
}