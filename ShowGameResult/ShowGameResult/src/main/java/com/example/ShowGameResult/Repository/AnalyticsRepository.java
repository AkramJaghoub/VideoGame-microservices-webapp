package com.example.ShowGameResult.Repository;

import com.example.ShowGameResult.Model.Analytics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalyticsRepository extends MongoRepository<Analytics, Double> {
}

