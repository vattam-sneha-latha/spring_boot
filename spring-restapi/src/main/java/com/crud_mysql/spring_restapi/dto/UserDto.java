package com.crud_mysql.spring_restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id ;// if id is confidential we can skip it in dto class and dto class constrcutor accepts only 3 fields firstName, lastName and email 
    private String firstName;
    private String lastName;
    private String email;
}
