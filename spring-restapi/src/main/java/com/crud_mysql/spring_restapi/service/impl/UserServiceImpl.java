package com.crud_mysql.spring_restapi.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.crud_mysql.spring_restapi.dto.UserDto;
import com.crud_mysql.spring_restapi.entity.User;
import com.crud_mysql.spring_restapi.mapper.UserMapper;
import com.crud_mysql.spring_restapi.repository.UserRepository;
import com.crud_mysql.spring_restapi.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    
    private UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto){   // we create restapi for this method in controller class
        // we want to save User object to database not Userdto soo.
        // convertu userdto to user jpa entity
        // we use the below conversion in all methods that make use of User class object so without repeating the below code in all other methods multiple times we create a mapper class by creating a new mapper package
        /* 
        User user=new User(
            userDto.getId(),
            userDto.getFirstName(),
            userDto.getLastName(),
            userDto.getEmail()
        );
        User savedUser=userRepository.save(user);
        // convert Jpa entity to Userdto
        UserDto savedUserDto=new UserDto(
            savedUser.getId(),
            savedUser.getFirstName(),
            savedUser.getLastName(),
            savedUser.getEmail()
        );
        */

        // code after creating mapper class
        // similarly we can refactor other methods also in the same way by using uUserDto
        User user=UserMapper.mapToUser(userDto);
        User savedUser=userRepository.save(user);
        UserDto savedUserDto=UserMapper.mapToUserDto(savedUser);   
        return savedUserDto;
    }

    @Override
    public User getUserById(Long userId){
        Optional<User> optionalUser=userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @Override
    public User updatedUser(User user){
        User existingUser=userRepository.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        User updatedUser=userRepository.save(existingUser);
        return updatedUser;
    }


    @Override
    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }
}
