package com.cognizant.moviecruiser.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.moviecruiser.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
