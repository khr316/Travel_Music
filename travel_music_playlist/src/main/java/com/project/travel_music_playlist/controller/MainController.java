package com.project.travel_music_playlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MainController {
    
    @GetMapping("main")
    public String main(HttpSession session){
        if(session.getAttribute("email") == null){
            return "redirect:/login";
        }
        return "main";
    }
}
