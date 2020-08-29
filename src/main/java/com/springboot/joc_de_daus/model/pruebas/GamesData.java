//package com.springboot.joc_de_daus.model.pruebas;
//
//import com.springboot.joc_de_daus.model.Game;
//import com.springboot.joc_de_daus.model.User;
//
//import javax.persistence.*;
//import java.io.Serializable;
//import java.util.Objects;
//
////@Entity
////@Table(name = "partida")
////@Access (AccessType.FIELD)
//public class GamesData  implements Serializable {
//    private static final long serialVersionUID = 2L;
//
//    private  String manolito;
//    private String cosasmaravillosass;
//    @EmbeddedId
//    private GamesId gamesId;
//
//    @ManyToOne
//    @MapsId("id_game")
//    @JoinColumn(name = "id_game")
//    private Game game;
//
//    @ManyToOne
//    @MapsId("id_game")
//    @JoinColumn(name = "id_user")
//    private User user;
//
//    public GamesData() {
//    }
//
//
//
//    public GamesData(GamesId gamesId, Game game, User user, String manolito, String cosasmaravillosass) {
//        this.gamesId = gamesId;
//        this.game = game;
//        this.user = user;
//        this.manolito = manolito;
//        this.cosasmaravillosass = cosasmaravillosass;
//    }
//
//    public GamesId getId(){
//        return gamesId;
//    }
//    public void setId(GamesId id){
//        this.gamesId = id;
//    }
//
//    public Game getGame() {
//        return game;
//    }
//
//    public void setGame(Game game) {
//        this.game = game;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public String getManolito() {
//        return manolito;
//    }
//
//    public void setManolito(String manolito) {
//        this.manolito = manolito;
//    }
//
//    public String getCosasmaravillosass() {
//        return cosasmaravillosass;
//    }
//
//    public void setCosasmaravillosass(String cosasmaravillosass) {
//        this.cosasmaravillosass = cosasmaravillosass;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        GamesData gamesData = (GamesData) o;
//        return Objects.equals(manolito, gamesData.manolito) &&
//                Objects.equals(cosasmaravillosass, gamesData.cosasmaravillosass) &&
//                Objects.equals(gamesId, gamesData.gamesId) &&
//                Objects.equals(game, gamesData.game) &&
//                Objects.equals(user, gamesData.user);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(manolito, cosasmaravillosass, gamesId, game, user);
//    }
//}
