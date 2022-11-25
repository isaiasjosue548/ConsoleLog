package com.console.log.console.log.models;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class WeeklyDemand {
    @Id
    private Long id;
    private Integer week;
    @ManyToOne
    @JoinColumn(name = "center_id")
    private Center center;
    @ManyToOne
    @JoinColumn(name = "meal_id")
    private Meal meal;
    private BigDecimal checkoutPrice;
    private BigDecimal basePrice;
    private boolean emailerForPromotion;
    private boolean homepageFeatured;
    private Long numOrders;


    public WeeklyDemand() {
    }

    public WeeklyDemand(Long id, Integer week, Center center, Meal meal, BigDecimal checkoutPrice, BigDecimal basePrice, boolean emailerForPromotion, boolean homepageFeatured, Long numOrders) {
        this.id = id;
        this.week = week;
        this.center = center;
        this.meal = meal;
        this.checkoutPrice = checkoutPrice;
        this.basePrice = basePrice;
        this.emailerForPromotion = emailerForPromotion;
        this.homepageFeatured = homepageFeatured;
        this.numOrders = numOrders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public BigDecimal getCheckoutPrice() {
        return checkoutPrice;
    }

    public void setCheckoutPrice(BigDecimal checkoutPrice) {
        this.checkoutPrice = checkoutPrice;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isEmailerForPromotion() {
        return emailerForPromotion;
    }

    public void setEmailerForPromotion(boolean emailerForPromotion) {
        this.emailerForPromotion = emailerForPromotion;
    }

    public boolean isHomepageFeatured() {
        return homepageFeatured;
    }

    public void setHomepageFeatured(boolean homepageFeatured) {
        this.homepageFeatured = homepageFeatured;
    }

    public Long getNumOrders() {
        return numOrders;
    }

    public void setNumOrders(Long numOrders) {
        this.numOrders = numOrders;
    }
}
