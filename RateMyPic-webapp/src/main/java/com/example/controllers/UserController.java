package com.example.controllers;

import com.example.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Bajtek on 03.05.2017.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping("/list")
    public String listOfUsers(Model model) {
        model.addAttribute("users", userDAO.getUsers());
        return "list";
    }

    @RequestMapping("/add")
    public String addUser(Model model) {
        return "add";
    }
    @RequestMapping("/details-{id}")
    public String userDetails(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("user", userDAO.getUserById(id));
        return "details";
    }

//    @RequestMapping("/sample")
//    public String sendExampleMessage(Model model) {
//        model.addAttribute("message", "Przykladowa wiadomosc testowa");
//        return "main";
//    }
//
//    @RequestMapping("/user/{name}")
//    public String details(@PathVariable("name") String userName) {
//        return "main";
//    }
//
////    @RequestMapping("/sample2")
////    public String sampleMethod(@PathVariable("name") String userName, ) {
////        return "main";
////    }
//
//    @RequestMapping("/method")
//    public String method() {
//        return "main";
//    }

}
