/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.usermanamentproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author minnie
 */
public class UserManamentProject {

    public static void main(String[] args) {
        User admin = new User("admin", "Administrator", "pass@1234", 'M', 'A');
        User user1 = new User("user1", "User 1", "pass@1234", 'M', 'U');
        User user2 = new User("user2", "User 2", "pass@1234", 'F', 'U');
        User user3 = new User("user3", "User 3", "pass@1234", 'F', 'U');
        System.out.println(admin);
        System.out.println(user1);
        System.out.println(user2);
        User[] userArr = new User[4];
        userArr[0] = admin;
        userArr[1] = user1;
        userArr[2] = user2;
        userArr[3] = user3;
        System.out.println("Print for userArr");
        for (int i = 0; i < userArr.length; i++) {
            System.out.println(userArr[i]);

        }
        System.out.println("ArrayList");
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(admin);
        System.out.println(userList.get(userList.size()-1) + "list size =" + userList.size());
        userList.add(user1);
        System.out.println(userList.get(userList.size()-1) + "list size =" + userList.size());
        userList.add(user2);
        System.out.println(userList.get(userList.size()-1) + "list size =" + userList.size());
        userList.add(user3);
        System.out.println(userList.get(userList.size()-1) + "list size =" + userList.size());
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i));

        }
        User user4 = new User("user4", "User 3", "pass@1234", 'M', 'U');
        userList.set(0, user4);
        userList.remove(userList.size()-1);
        System.out.println(userList.get(0));
        for (User u: userList) {
            System.out.println(u);

        }
        

    }
}
