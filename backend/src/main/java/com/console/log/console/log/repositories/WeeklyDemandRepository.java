package com.console.log.console.log.repositories;

import com.console.log.console.log.models.WeeklyDemand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface WeeklyDemandRepository extends JpaRepository<WeeklyDemand, Long> {

    @Query(value = "SELECT meal_id, center_id, week, num_orders from j2d.weekly_demand", nativeQuery = true)
    List<Objects[]> selectMealAndQuantity();

    @Query(value = "SELECT sum(num_orders), center_id, meal_id from j2d.weekly_demand group by center_id;", nativeQuery = true)
    List<Objects[]> sumOrdersOfProductByCenterId();

    @Query(value = "SELECT sum(num_orders), week, meal_id from j2d.weekly_demand group by meal_id;", nativeQuery = true)
    List<Objects[]> sumOrdersOfProductsByProduct();
}
