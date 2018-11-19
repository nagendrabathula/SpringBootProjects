package com.aggrid.curdapp.repositories;
import org.springframework.data.repository.CrudRepository;

import com.aggrid.curdapp.model.Sport;

public interface SportRepository extends CrudRepository<Sport, Long> {
    Sport findByName(String name);
}