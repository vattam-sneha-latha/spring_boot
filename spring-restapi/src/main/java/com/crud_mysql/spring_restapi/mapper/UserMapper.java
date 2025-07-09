package com.crud_mysql.spring_restapi.mapper;

import com.crud_mysql.spring_restapi.dto.UserDto;
import com.crud_mysql.spring_restapi.entity.User;

public class UserMapper {
    public static UserDto mapToUserDto(User user){
         UserDto savedUserDto=new UserDto(
            user.getId(),   // if id is there in dto 
            user.getFirstName(),
            user.getLastName(),
            user.getEmail()
        );
        return savedUserDto;
    }

    public static User mapToUser(UserDto userDto){
        User user=new User(
            userDto.getId(),  // if id is not there in dto the User class constructor should accept only three fields and define a constructor with only 3 fields in user class
            userDto.getFirstName(),
            userDto.getLastName(),
            userDto.getEmail()
        );
        return user;
    }
}
