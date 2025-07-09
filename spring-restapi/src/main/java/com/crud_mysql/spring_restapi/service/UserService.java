package com.crud_mysql.spring_restapi.service;

import java.util.List;

import com.crud_mysql.spring_restapi.dto.UserDto;
import com.crud_mysql.spring_restapi.entity.User;

public interface UserService {

    // User createUser(User user);
    UserDto createUser(UserDto user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updatedUser(User user);

    void deleteUser(Long userId);
}
