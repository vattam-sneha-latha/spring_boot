package com.crud_mysql.spring_restapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud_mysql.spring_restapi.dto.UserDto;
import com.crud_mysql.spring_restapi.entity.User;
import com.crud_mysql.spring_restapi.service.UserService;

import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/users") // base url
public class UserController {

    private UserService userService;

    // build create user REst API
    // @RequestBody is responsible for retreving the HTTP request body (JSON) and automatically converting it to the Java object
    // refactoring createUser REST API
    // similarly we can use UserDto in other REST API's also
    @PostMapping("/create/user")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){
        UserDto savedUser=userService.createUser(user);
        return new ResponseEntity<>(savedUser,HttpStatus.CREATED);
    }

    @GetMapping("/get-user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
        User user=userService.getUserById(userId);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @GetMapping("/get-users")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users=userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }
    
    @PutMapping("/update-user")
    public ResponseEntity<User> updateUser(@RequestBody User user){
        User savedUser=userService.updatedUser(user);
        return new ResponseEntity<>(savedUser,HttpStatus.OK);
    }
    
    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity<>("User Removed successfully",HttpStatus.OK);
    }

}
