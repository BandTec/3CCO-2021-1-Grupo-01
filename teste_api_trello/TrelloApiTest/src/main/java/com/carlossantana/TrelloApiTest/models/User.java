package com.carlossantana.TrelloApiTest.models;

import kong.unirest.json.JSONObject;

import java.util.List;

public abstract class User {

    private String id;
    private String username;
    private String fullName;
    private String email;
    private String senha;
    private List<Object> idBoards;
    private Integer humor;
    private String key = "fafa203c2eb7040d43c24ad7ca66ba32";
    private String token = "9156f73352b670b11ad66b6321f9a0833bd1daf8351859ef497fe13a8b2bb3ad";

//    public User(String key, String token) {
//        this.key = key;
//        this.token = token;
//    }

    //Tentativa de login
    public User(String id, String username, String fullName, String email, String senha) {
        this.id = id;
        this.username = username;
        this.fullName = fullName;
        this.email = email;
        this.senha = senha;
    }

    public abstract Double getTaskPontuation(JSONObject jsonCard);

    //Getter e Setter
    public String getSenha() { return senha; }

    public void setSenha(String senha) { this.senha = senha; }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Object> getIdBoards() {
        return idBoards;
    }

    public void setIdBoards(List<Object> idBoards) {
        this.idBoards = idBoards;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getKey() {
        return key;
    }

    public String getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "User{" +
                "key='" + key + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}

