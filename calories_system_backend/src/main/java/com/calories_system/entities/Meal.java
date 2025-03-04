package com.calories_system.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
//    @ManyToOne
//    @ToString.Exclude
//    @JsonIgnore
//    @Enumerated(EnumType.STRING)
    private MealType mealType;
//    @ManyToMany
//    @ToString.Exclude
//    @JsonIgnore
    private List<String> foodItems;


}
