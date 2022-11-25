package com.console.log.console.log.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Meal {
    @Id
    private Long mealId;
    private String category;
    private String cuisine;
    @OneToMany(mappedBy = "meal")
    private List<WeeklyDemand> weeklyDemandList;

    private String name;
    public Meal() {
    }

    public Meal(Long mealId, String category, String cuisine, String name) {
        this.mealId = mealId;
        this.category = category;
        this.cuisine = cuisine;
        this.name = name;
    }

    public Long getMealId() {
        return mealId;
    }

    public void setMealId(Long mealId) {
        this.mealId = mealId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
