package com.example.ShowGameResult.Service;

import com.example.ShowGameResult.Model.Analytics;
import com.example.ShowGameResult.Repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowVideoGame {
    @Autowired
    AnalyticsRepository analyticsRepository;

    public List<Analytics> getGameAnalyticResults(){
        return analyticsRepository.findAll();
    }
}
