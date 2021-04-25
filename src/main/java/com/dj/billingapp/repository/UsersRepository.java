package com.dj.billingapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dj.billingapp.entity.User;

@Repository
interface UsersRepository extends CrudRepository<User, Long>{

}
