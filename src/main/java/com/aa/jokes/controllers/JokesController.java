package com.aa.jokes.controllers;

import com.aa.jokes.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showRandomJoke(Model model){
        model.addAttribute("joke",jokeService.getRandomJoke());
        return "chucknorris";
    }
}
