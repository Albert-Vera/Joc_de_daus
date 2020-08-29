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

    public int[] getPlay() {
        return play;
    }

    public void setPlay(int[] play) {
        this.play = play;
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
}
