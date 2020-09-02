package com.springboot.joc_de_daus.model;

import javax.persistence.*;

@Entity
@Table(name = "plays")
public class Plays {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_play")
    private int idPlay;

    @Column(name = "play")
    private int[] play = new int[2];

    @Column(name = "win")
    private boolean win;

    @Column(name = "userId")
    private int userId;

    @ManyToOne (fetch = FetchType.LAZY,  cascade=CascadeType.REFRESH)
    @JoinColumn(name="id_user", insertable = false, updatable = false)
    private User userMany;

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

    public User getUserMany() {
        return userMany;
    }

    public void setUserMany(User userMany) {
        this.userMany = userMany;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
