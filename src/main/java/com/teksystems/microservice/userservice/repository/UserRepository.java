package com.teksystems.microservice.userservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.teksystems.microservice.userservice.model.User;


@Repository
//@RepositoryRestResource
public interface UserRepository extends CrudRepository<User, Long>{

}
