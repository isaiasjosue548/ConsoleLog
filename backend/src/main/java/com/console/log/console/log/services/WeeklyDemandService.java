package com.console.log.console.log.services;

import com.console.log.console.log.models.WeeklyDemand;
import com.console.log.console.log.repositories.WeeklyDemandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class WeeklyDemandService {
    @Autowired
    WeeklyDemandRepository weeklyDemandRepository;

    public List<Objects[]> selectMealAndQuantity(){
        return weeklyDemandRepository.selectMealAndQuantity();
    }

    public List<Objects[]> sumOrdersOfProductByCenterId(){
        return weeklyDemandRepository.sumOrdersOfProductByCenterId();
    }

    public List<Objects[]> sumOrdersOfProductsByProduct(){
        return weeklyDemandRepository.sumOrdersOfProductsByProduct();
    }
}
