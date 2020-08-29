package com.anhduc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.anhduc.model.SmartPhone;
@Repository
public interface SmpRepository extends CrudRepository<SmartPhone, Integer> {

}
