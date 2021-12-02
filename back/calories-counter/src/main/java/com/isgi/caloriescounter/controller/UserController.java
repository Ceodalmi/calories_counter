package com.isgi.caloriescounter.controller;

import com.isgi.caloriescounter.datamodel.entity.User;
import com.isgi.caloriescounter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(produces = "application/json", value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/{user_id}")
    public ResponseEntity<?> getUser(@PathVariable("user_id") Long id) {
        Optional<User> u = userService.getUser(id);
        if(u.isPresent()) {
            return new ResponseEntity<>(u, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping(value = "create")
    public ResponseEntity<?> createUser(@RequestBody User u) {
        userService.createUser(u);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @DeleteMapping(value = "delete/{user_id}")
    public ResponseEntity<?> deleteUser(Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
