package com.console.log.console.log.services;

import com.console.log.console.log.models.Center;
import com.console.log.console.log.models.WeeklyDemand;
import com.console.log.console.log.repositories.CenterRepository;
import com.console.log.console.log.repositories.WeeklyDemandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CenterService {
    @Autowired
    CenterRepository centerRepository;

    public Iterable<Center> list() {
        return centerRepository.findAll();
    }

    public Iterable<Center> save(List<Center> centers) {
        return centerRepository.saveAll(centers);
    }


}
