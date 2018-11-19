package com.aggrid.curdapp.repositories;
import org.springframework.data.repository.CrudRepository;

import com.aggrid.curdapp.model.Result;

public interface ResultRepository extends CrudRepository<Result, Long> {
}