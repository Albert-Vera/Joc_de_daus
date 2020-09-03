package com.springboot.joc_de_daus.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_user")
    private int idUser;

    @Column(name = "userName")
    private String userName;

    @Column(name = "counterPlays")
    private int counterPlays = 0;

    @Column(name = "ranking")
    private double ranking = 0;

    @Column(name = "playsWon")
    private int playsWon = 0;


    @ManyToMany(mappedBy="userManyList" ) //, cascade = CascadeType.ALL
    private List<Plays> playsList ;

//    @Column(name = "llista")
//    @ElementCollection(targetClass=Plays.class, fetch = FetchType.LAZY)
//    private List<Plays> llista = new ArrayList<>();

    public User() {
    }
    public User(int idUser, String userName, int counterPlays, double ranking, int playsWon, List<Plays> playsList) {
        this.idUser = idUser;
        this.userName = userName;
        this.counterPlays = counterPlays;
        this.ranking = ranking;
        this.playsWon = playsWon;
        this.playsList = playsList;
    }

//    public List<Plays> getLlista() {
//        return llista;
//    }
//
//    public void setLlista(Plays play) {
//        this.llista.add(play);
//    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public List<Plays> getPlaysList() {
        return playsList;
    }

    public void setPlaysList(Plays play) {
        if(this.playsList == null){
            this.playsList = new ArrayList<>();
        }
        this.playsList.add(play);
        System.out.println("anadido..... " + getUserName() + "  " +playsList.size());
    }

    public int getCounterPlays() {
        return counterPlays;
    }

    public void setCounterPlays(int counterPlays) {
        this.counterPlays = counterPlays;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    public int getPlaysWon() {
        return playsWon;
    }

    public void setPlaysWon(int playsWon) {
        this.playsWon = playsWon;
    }
}
