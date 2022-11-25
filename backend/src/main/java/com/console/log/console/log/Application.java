package com.console.log.console.log;

import aj.org.objectweb.asm.TypeReference;
import com.console.log.console.log.enums.CenterType;
import com.console.log.console.log.models.Center;
import com.console.log.console.log.models.Meal;
import com.console.log.console.log.models.WeeklyDemand;
import com.console.log.console.log.repositories.CenterRepository;
import com.console.log.console.log.repositories.MealRepository;
import com.console.log.console.log.repositories.WeeklyDemandRepository;
import com.console.log.console.log.services.MealService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Application implements CommandLineRunner{
	@Autowired
	CenterRepository centerRepository;

	@Autowired
	MealRepository mealRepository;

	@Autowired
	WeeklyDemandRepository weeklyDemandRepository;


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(new File("C:\\Users\\raist\\Desktop\\console.log2\\center.csv"));
		scanner.nextLine();
		while (scanner.hasNextLine()){
			String[] splitOut  = scanner.nextLine().split(",");
			Center center = new Center(Long.valueOf(splitOut[1]), Integer.valueOf(splitOut[2]),Integer.valueOf(splitOut[3]),CenterType.valueOf(splitOut[4]),Double.valueOf(splitOut[5]), splitOut[6]);
			centerRepository.save(center);
		}

		scanner = new Scanner(new File("C:\\Users\\raist\\Desktop\\console.log2\\product.csv"));
		scanner.nextLine();
		while (scanner.hasNextLine()){
			String[] splitOut = scanner.nextLine().split(",");
			Meal meal = new Meal(Long.valueOf(splitOut[1]), splitOut[2], splitOut[3], splitOut[4]);
			mealRepository.save(meal);

		}

		scanner = new Scanner(new File("C:\\Users\\raist\\Desktop\\console.log2\\weekly_demand.csv"));
		scanner.nextLine();
		while (scanner.hasNextLine()){
			String[] splitOut = scanner.nextLine().split(",");
			if (splitOut[6].equals("0")){
				splitOut[6] = "false";
			}else{
				splitOut[6] = "true";
			}
			if (splitOut[7].equals("0")){
				splitOut[7] = "false";
			}else{
				splitOut[7] = "true";
			}
			WeeklyDemand weeklyDemand = new WeeklyDemand(Long.valueOf(splitOut[0]), Integer.valueOf(splitOut[1]), centerRepository.findById(Long.valueOf(splitOut[2])).get(), mealRepository.findById(Long.valueOf(splitOut[3])).get(), BigDecimal.valueOf(Double.valueOf(splitOut[4])),BigDecimal.valueOf(Double.valueOf(splitOut[5])), (Boolean.valueOf(splitOut[6])), Boolean.valueOf(splitOut[7]), Long.valueOf(splitOut[8]));

			weeklyDemandRepository.save(weeklyDemand);

		}

	}
}
