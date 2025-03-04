package com.calories_system.Service;


import com.calories_system.Repository.FoodItemRepository;
import com.calories_system.Repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FoodItemService {

    private final FoodItemRepository foodItemRepository;
    private final MealRepository mealRepository;


}
