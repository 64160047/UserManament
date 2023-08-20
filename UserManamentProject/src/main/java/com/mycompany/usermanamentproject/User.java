/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermanamentproject;

import java.io.Serializable;

/**
 *
 * @author minnie
 */
public class User implements Serializable{
    private int id;
    private String login;
    private String name;
    private String password;
    private char gender; // M,F
    private char role; // A, U
   
    
    public User(String login, String name, String password, char gender, char role) {
        this(-1, login, name, password, gender, role);
   
    }
    public User(int id, String login, String name, String password, char gender, char role) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getGender() {
        return gender;
    }
    public String getGenderString() {
        if(gender == 'M') {
            return "Male";
        }else {
            return "Female";
        }
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getRole() {
        return role;
    }
     public String getRoleString() {
        if(gender == 'A') {
            return "Admin";
        }else {
            return "User";
        }
    }


    public void setRole(char role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", name=" + name + ", password=" + password + ", gender=" + gender + ", role=" + role + '}';
    }

    

    
   


    
}
