package com.springboot.joc_de_daus.controller;

import com.springboot.joc_de_daus.model.User;
import com.springboot.joc_de_daus.service.ControlGame;
import com.springboot.joc_de_daus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private IUserService iUserService;

    private ControlGame controlGame = new ControlGame();

    @GetMapping("/list")
    public String llistar (Model model){
        List<User> userList = iUserService.findAll();
        model.addAttribute("listUsers", userList);
        return "index";
    }

    @GetMapping("/new")
    public String nuevo(User user){
        return "insert";
    }
    @PostMapping("insert")
    public String insert(@Validated User user){
        user = controlGame.asignarValoresUser(user);
        iUserService.save(user);
        return "redirect:/list";
    }
}
