package com.springboot.joc_de_daus.controller;

import com.springboot.joc_de_daus.model.Plays;
import com.springboot.joc_de_daus.model.User;
import com.springboot.joc_de_daus.service.ControlGame;
import com.springboot.joc_de_daus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/play/{id}")
    public String play (@PathVariable int id, Model model){
//        List<User> userPlayId = iUserService.findByIdUser(id-1);

        List<User> userList = iUserService.findAll();
        List<User> userById = iUserService.findByIdUser(id);
       // controlGame.asignarValoresUser(userList.get(id -1));
        model.addAttribute("userPlayId", id -1);
        model.addAttribute("listUsers", userList);
        model.addAttribute("rollDice",controlGame.rollDice(userById.get(0)));

        iUserService.save(userById.get(0));
        return "play";
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
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Integer id, Model model){
        Optional<User> user = iUserService.findById(id);
        model.addAttribute("user", user.get());
        return "editar";
    }
    @PostMapping("/actualizar")
    public String actualizar(@Validated User user){
        iUserService.save(user);
        return "redirect:/list";
    }
    @DeleteMapping("/deletePictureParaPostman/{id}")
    public String deleteParaPostman(@PathVariable("id") int id){
        iUserService.deleteById(id);
        return "redirect:/list";
    }
    @GetMapping("/deletePicture/{id}")
    public String delete(@PathVariable("id") int id){
        iUserService.deleteById(id);
        return "redirect:/list";
    }
}
