package com.example.enterVideoGame.service;

import com.example.enterVideoGame.model.VideoGame;
import com.example.enterVideoGame.repository.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoGameService {


    private final VideoGameRepository gameRepository;

    @Autowired
    public VideoGameService(VideoGameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public void addVideoGame(VideoGame videoGame) {
        gameRepository.save(videoGame);
    }
}