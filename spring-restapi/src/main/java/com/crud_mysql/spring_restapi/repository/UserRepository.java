package com.crud_mysql.spring_restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud_mysql.spring_restapi.entity.User;

// JpaRepository<entity,Type of primary key in entity>
public interface UserRepository extends JpaRepository<User,Long>{
    // JpaRepository interface internally extends CrudRepository interface

}
