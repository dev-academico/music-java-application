package model;

import Interfaces.InterfaceAvlTree;

public class User implements InterfaceAvlTree {
    private static int counterUsers = 0;

    private int id;
    private String name;
    private String email;

    public User() {
        // Add input logic
    }

    public int getKey() {
        return id;
    }

    public User(String name, String email) {
        this.id = counterUsers++;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User:" + this.id + " - " + this.name + " - " + this.email;
    }
}
