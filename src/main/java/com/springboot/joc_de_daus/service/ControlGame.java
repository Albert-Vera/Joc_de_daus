package com.springboot.joc_de_daus.service;

import com.springboot.joc_de_daus.model.Plays;
import com.springboot.joc_de_daus.model.User;

import java.text.DecimalFormat;
import java.util.List;

public class ControlGame {
    Plays plays = new Plays();
    int diceOne;
    int diceTwo;
    public User asignarValoresUser(User user){

//        user.setCounterPlays(0);
//        user.setPlaysWon(0);
//        user.setRanking(0);
        return user;
    }
    public Plays rollDice(User user){

        if (user.getCounterPlays() == 0) {
            diceOne = 0;
            diceTwo = 0;
        }else {
            diceOne = (int) (Math.random() * 6 + 1);
            diceTwo = (int) (Math.random() * 6 + 1);
        }
        plays.setPlay( diceOne , diceTwo);
        plays.setWin(true);

        if ( diceOne + diceTwo == 7) {
            plays.setWin(true);
            user.setPlaysWon(user.getPlaysWon()+1);
        }else plays.setWin(false);

        user.setCounterPlays(user.getCounterPlays()+1);
        if (user.getPlaysWon() > 0 ) {
//            DecimalFormat formatter = new DecimalFormat("###.##");
//            double numero =((double)user.getPlaysWon() / (double)user.getCounterPlays() *100);
           // double ranking = Double.parseDouble(formatter.format(numero));
            user.setRanking((double)user.getPlaysWon() / (double)user.getCounterPlays() *100) ;
        }
        user.setPlaysList(plays);
        for (Plays as: user.getPlaysList()){
            System.out.println("jugada: ..................... " + as.getPlay_A()+"  .........  " +as.getPlay_B() + " ....  ");
        }
//        plays.setUserId( plays.getUserMany().getIdUser());
        return plays;
    }
}
