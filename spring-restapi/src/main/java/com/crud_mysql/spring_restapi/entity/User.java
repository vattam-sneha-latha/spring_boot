package com.crud_mysql.spring_restapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// to automatically generate getter setter methods and constructor
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity // specifies that the class is an entity
@Table(name="users") // if we dont give this annotation spring will create table with name as same as the class name
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private String firstName;
    @Column(nullable=false)
    private String lastname;
    @Column(nullable=false,unique=true)
    private String email;
}
