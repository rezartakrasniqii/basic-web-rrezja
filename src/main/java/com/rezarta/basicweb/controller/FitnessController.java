package com.rezarta.basicweb.controller;


import com.rezarta.basicweb.model.FitnessUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class FitnessController {

    ArrayList <FitnessUser> fitnessUsers = new ArrayList<>();

    @GetMapping("/fitnessapp")
    public String getFitness(Model model) {
        model.addAttribute("fitnessUser", new FitnessUser());
        return "FitnessApp";
    }

    @PostMapping("/fitness")
    public String createUser(@ModelAttribute FitnessUser fitnessUser, Model model) {
        model.addAttribute("fitnessUser", fitnessUser);
        return "ViewFitnessUsers";
    }
@GetMapping (/"ViewFitnessUsers")
    public String getViewUsers () {
        return "ViewFitnessUsers";
}
}
