package com.ProjetSpringBoot.FitCoach.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {


    @PostMapping("/addUser")
    public String addUser(@RequestParam("prenom") String prenom,@RequestParam("nom") String nom,@RequestParam("email") String email, @RequestParam("mdp") String mdp){
/*
        String nom = user.getNom();
        String prenom = user.getPrenom();
        String email = user.getEmail();
        String mdp = user.getMpd();
*/
        //System.out.println(prenom);
        // Traiter les données du formulaire ici
        User user = new User(nom, prenom, email, mdp);
        return "index";
    }

}
