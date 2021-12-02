package com.isgi.caloriescounter.service;

import com.isgi.caloriescounter.datamodel.entity.User;
import com.isgi.caloriescounter.datamodel.repository.MealRepository;
import com.isgi.caloriescounter.datamodel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User u) {
        userRepository.save(u);
        return u;
    }


    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
