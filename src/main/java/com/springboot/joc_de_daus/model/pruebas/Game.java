//package com.springboot.joc_de_daus.model;
//
//import org.springframework.lang.NonNull;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.List;
//import java.util.Objects;
//
//@Entity
//@Table(name = "game")
//
//public class Game {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id_game")
//    private int idGame;
//
//    @Column(name = "score")
//    private int score;
//
//
//    @ManyToOne (fetch = FetchType.LAZY,  cascade=CascadeType.REFRESH)
//    @JoinColumn(name="id_user", insertable = false, updatable = false)
//    private User userMany;
//
//    @OneToMany(mappedBy="playMany" , fetch = FetchType.LAZY,  cascade=CascadeType.ALL)
//    private List<Plays> playsList ;
//
//
//    public Game() {
//    }
//
//    public int getIdGame() {
//        return idGame;
//    }
//
//    public void setIdGame(int idGame) {
//        this.idGame = idGame;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//
//    public User getUserMany() {
//        return userMany;
//    }
//
//    public void setUserMany(User userMany) {
//        this.userMany = userMany;
//    }
//
//    public List<Plays> getPlaysList() {
//        return playsList;
//    }
//
//    public void setPlaysList(List<Plays> playsList) {
//        this.playsList = playsList;
//    }
//}
