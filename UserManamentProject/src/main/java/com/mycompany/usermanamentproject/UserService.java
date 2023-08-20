/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermanamentproject;

import java.util.ArrayList;

/**
 *
 * @author minnie
 */
public class UserService {

    private ArrayList<User> userList;
    private int lastId = 1;

    public UserService() {
        userList = new ArrayList<User>();
    }

    public User addUser(User newUser) {
        newUser.setId(lastId++);
        userList.add(newUser);
        return newUser;
    }

    public User getUser(int index) {
        return userList.get(index);
    }

    public ArrayList<User> getUsers() {
        return userList;
    }

    public int getSize() {
        return userList.size();
    }

    public void logUserList() {
        for (User u : userList) {
            System.out.println(u);
        }
    }

    User updateUser(int index, User updatedUser) {
        User user = userList.get(index);
        user.setLogin(updatedUser.getLogin());
        user.setName(updatedUser.getName());
        user.setPassword(updatedUser.getPassword());
        user.setGender(updatedUser.getGender());
        user.setRole(updatedUser.getRole());
        return user;
    }

    User deleteUser(int index) {
       return  userList.remove(index);
       
    }

}
