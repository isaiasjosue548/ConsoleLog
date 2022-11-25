package com.console.log.console.log.controllers;

import com.console.log.console.log.services.WeeklyDemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class WeeklyDemandController {

    @Autowired
    WeeklyDemandService weeklyDemandService;


    @GetMapping("/meals")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Objects[]> selectMealAndQuantity(){
        return weeklyDemandService.selectMealAndQuantity();
    }

    @GetMapping("/products_by_center")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Objects[]> sumOrdersOfProductByCenterId(){
        return weeklyDemandService.sumOrdersOfProductByCenterId();
    }

    @GetMapping("/products_by_week")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Objects[]> sumOrdersOfProductByProduct(){
        return weeklyDemandService.sumOrdersOfProductsByProduct();
    }
}
