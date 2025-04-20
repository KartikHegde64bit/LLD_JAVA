package com.example.observer.Controllers;

import com.example.observer.Services.UserService;
import com.example.observer.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
//import org.springframework.stereotype.Repository;


@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }


    @PostMapping("/mycompany/user")
    @ResponseBody
    public ResponseEntity<String> createUser(@RequestBody User user) throws Exception {
        if(user == null) {
            throw new IllegalArgumentException("Request Empty");
        }
        try{
            UserService userService = new UserService();
            userService.createUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body(user.toString());
        } catch (ResponseStatusException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Problem Occurred While Creating User");
        }
        //return responseBody;
    }

    @GetMapping("/mycompany/user/{userId}")
    @ResponseBody
    public ResponseEntity<String> getUser(@PathVariable Long userId) {
        User user = userService.getUserById(userId);
        if(user == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The user not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(user.toString());
    }
}
