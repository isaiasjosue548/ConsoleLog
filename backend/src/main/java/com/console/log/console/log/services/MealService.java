package com.console.log.console.log.services;

import com.console.log.console.log.models.Center;
import com.console.log.console.log.models.Meal;
import com.console.log.console.log.repositories.CenterRepository;
import com.console.log.console.log.repositories.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MealService {
    @Autowired
    MealRepository mealRepository;

    public Iterable<Meal> list() {
        return mealRepository.findAll();
    }

    public Iterable<Meal> save(List<Meal> meals) {
        return mealRepository.saveAll(meals);
    }
}
