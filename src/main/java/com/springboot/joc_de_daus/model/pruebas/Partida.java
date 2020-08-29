//package com.springboot.joc_de_daus.model.pruebas;
//
//
//
//import javax.persistence.*;
//import java.io.Serializable;
//
//@Entity
//@Table(name = "PruebaPartida")
//public class Partida implements Serializable {
//
//    @EmbeddedId
//    @Column(name = "id")
//    private Usuario id;
//
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="idPartida")
//    private int idPartida;
//
//    @Column(name = "numero")
//    private String numero;
//
//    public Usuario getId() {
//        return id;
//    }
//
//    public int getIdPartida() {
//        return idPartida;
//    }
//
//    public void setIdPartida(int idPartida) {
//        this.idPartida = idPartida;
//    }
//
//    public void setId(Usuario id) {
//        this.id = id;
//    }
//
//    public String getNumero() {
//        return numero;
//    }
//
//    public void setNumero(String numero) {
//        this.numero = numero;
//    }
//}
