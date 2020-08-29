//package com.springboot.joc_de_daus.model.pruebas;
//
//
//
//import javax.persistence.*;
//
//import java.io.Serializable;
//import java.util.Objects;
//
////@Entity
////@Table(name = "usuario")
//@Embeddable
//public class Usuario implements Serializable {
//
//
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="id_usuaria")
//    private int idUsuario;
//    private String nom, email;
//
//    public Usuario() {
//    }
//
//    public int getIdUsuario() {
//
//        return idUsuario;
//    }
//
//    public void setIdUsuario(int id) {
//        this.idUsuario = id;
//    }
//
//    public String getNom() {
//        return nom;
//    }
//
//    public void setNom(String nom) {
//        this.nom = nom;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Usuario usuario = (Usuario) o;
//        return idUsuario == usuario.idUsuario &&
//                Objects.equals(nom, usuario.nom) &&
//                Objects.equals(email, usuario.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(idUsuario, nom, email);
//    }
//}
