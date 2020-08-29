package com.springboot.joc_de_daus.service;

import com.springboot.joc_de_daus.model.User;

public class ControlGame {

    public User asignarValoresUser(User user){

        user.setCounterPlays(10);
        user.setPlaysWon(5);
        user.setRanking(50);
        return user;
    }
}
