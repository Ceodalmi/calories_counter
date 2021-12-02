package com.isgi.caloriescounter.service;

import com.isgi.caloriescounter.datamodel.entity.Meal;
import com.isgi.caloriescounter.datamodel.entity.User;
import com.isgi.caloriescounter.datamodel.repository.MealRepository;
import com.isgi.caloriescounter.datamodel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.NotSupportedException;
import java.util.Optional;

@Service
public class MealService {

    @Autowired
    private MealRepository mealRepository;

    @Autowired
    private UserRepository userRepository;


    public Meal addMeal(Long userId, Meal meal) {
        Optional<User> u = userRepository.findById(userId);
        if(!u.isPresent()) {
            throw new UnsupportedOperationException();
        }
        meal.setUser(u.get());
        mealRepository.save(meal);
        return meal;
    }


    public void deleteMeal(Long mealId) {
        mealRepository.deleteById(mealId);
    }
}
