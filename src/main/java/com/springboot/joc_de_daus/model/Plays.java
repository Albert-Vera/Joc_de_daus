package com.springboot.joc_de_daus.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "plays")
public class Plays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_play")
    private int idPlay;

    @Column(name = "play")
    private int[] play = new int[2];

    @Column(name = "win")
    private boolean win;

    @Column(name = "userId")
    private int userId;

    @ManyToMany (  cascade = CascadeType.ALL) //fetch = FetchType.LAZY,
    @JoinTable(
            name = "user_play",
            joinColumns = {@JoinColumn(name = "FK_PLAY", nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "FK_USER", nullable = false)}
    )
    private List<User> userManyList;
   // @JoinColumn(name="id_user") //, insertable = false, updatable = false

    //private Map<Integer, Integer> lista = new HashMap<>();
    public Plays() {
    }

    public int getIdPlay() {
        return idPlay;
    }

    public void setIdPlay(int idPlay) {
        this.idPlay = idPlay;
    }

    public int getPlay_A() {

        return this.play[0];
    }
    public int getPlay_B() {

        return this.play[1];
    }

    public void setPlay(int a, int b) {

        this.play[0] = a;
        this.play[1] = b;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public List<User> getUserManyList() {
        return userManyList;
    }

    public void setUserManyList(User userMany) {
        if(this.userManyList == null){
            this.userManyList = new ArrayList<>();
        }
        this.userManyList.add(userMany);
    }

    public int[] getPlay() {

        return play;
    }

    public void setPlay(int[] play) {
        this.play = play;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
