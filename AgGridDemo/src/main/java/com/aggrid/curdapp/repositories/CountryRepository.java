package com.aggrid.curdapp.repositories;
import org.springframework.data.repository.CrudRepository;

import com.aggrid.curdapp.model.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {
    Country findByName(String name);
}