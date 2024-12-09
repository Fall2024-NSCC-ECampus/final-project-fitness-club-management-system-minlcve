package com.fitnessclub.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    // Home page route
    @GetMapping("/")
    public String home() {
        return "index";  // Returns index.html from the templates folder
    }

    // Login page route
    @GetMapping("/login")
    public String login() {
        return "login";  // Returns login.html from the templates folder
    }

    // Dashboard page route (requires login)
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";  // Returns dashboard.html from the templates folder
    }

    // Profile page route
    @GetMapping("/profile")
    public String profile() {
        return "profile";  // Returns profile.html from the templates folder
    }

    // Logout page route
    @GetMapping("/logout")
    public String logout() {
        return "logout";  // Returns a logout confirmation page or a redirect to home
    }

    // Error page route
    @GetMapping("/error")
    public String error() {
        return "error";  // Returns error.html from the templates folder
    }
}
