package com.example.ShowGameResult.Controllers;

import com.example.ShowGameResult.Model.Analytics;
import com.example.ShowGameResult.Service.ShowVideoGame;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/showVideoGame")
public class ShowVideoGameController {

    @Autowired
    private ShowVideoGame showGame;

    @GetMapping("/videoGameAnalysis")
    public String showVideoGameAnalysis(Model model) {
        List<Analytics> analyticsList = showGame.getGameAnalyticResults();
        model.addAttribute("analyticsList", analyticsList);
        return "results";
    }
}