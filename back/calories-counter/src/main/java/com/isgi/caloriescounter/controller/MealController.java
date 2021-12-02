package com.isgi.caloriescounter.controller;

import com.isgi.caloriescounter.datamodel.entity.Meal;
import com.isgi.caloriescounter.datamodel.entity.User;
import com.isgi.caloriescounter.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(produces = "application/json", value = "meal")
public class MealController {

    @Autowired
    private MealService mealService;

    @PostMapping(value = "/add/user/{id_user}")
    public ResponseEntity<?> addMeal(@PathVariable("id_user") Long userId, @RequestBody Meal meal) {
        Meal m = mealService.addMeal(userId, meal);
        return new ResponseEntity<>(m, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/meal/{meal_id}")
    public ResponseEntity<?> deleteMeal(@PathVariable("meal_id") Long mealId) {
        mealService.deleteMeal(mealId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
