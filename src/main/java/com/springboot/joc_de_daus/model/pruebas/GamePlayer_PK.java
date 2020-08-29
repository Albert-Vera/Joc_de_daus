//package com.springboot.joc_de_daus.model;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.persistence.Embeddable;
//import java.io.Serializable;
//import java.util.Objects;
//
//@Embeddable
//public class GamePlayer_PK implements Serializable {
//
//    private int gameId;
//    private int playerId;
//
//    public GamePlayer_PK() {
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GamePlayer_PK that = (GamePlayer_PK) o;
//        return gameId == that.gameId &&
//                playerId == that.playerId;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(gameId, playerId);
//    }
//
//    public int getGameId() {
//        return gameId;
//    }
//
//    public int getPlayerId() {
//        return playerId;
//    }
//
//    public void setGameId(int gameId) {
//        this.gameId = gameId;
//    }
//
//    public void setPlayerId(int storeId) {
//        this.playerId = storeId;
//    }
//}
