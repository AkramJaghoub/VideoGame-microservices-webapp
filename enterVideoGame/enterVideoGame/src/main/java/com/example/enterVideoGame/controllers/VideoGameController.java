package com.example.enterVideoGame.controllers;

import com.example.enterVideoGame.model.VideoGame;
import com.example.enterVideoGame.service.AnalyticsService;
import com.example.enterVideoGame.service.VideoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class VideoGameController {

    private final VideoGameService videoGameService;
    private final AnalyticsService analyticsService;

    @Autowired
    public VideoGameController(VideoGameService videoGameService, AnalyticsService analyticsService){
        this.videoGameService = videoGameService;
        this.analyticsService = analyticsService;
    }

    @GetMapping("/addVideoGame")
    public String showVideoGameForm(Model model) {
        model.addAttribute("videoGame", new VideoGame());
        return "add_video_game";
    }

    @PostMapping("/addVideoGame")
    public String addVideoGame(VideoGame videoGame, RedirectAttributes redirectAttributes) {
        videoGameService.addVideoGame(videoGame);
        analyticsService.notifyNewGameEntry();
        redirectAttributes.addFlashAttribute("success", "New video game has been added!");
        return "redirect:/addVideoGame";
    }
}