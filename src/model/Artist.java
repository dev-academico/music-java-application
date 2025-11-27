package model;

import Interfaces.InterfaceAvlTree;

public class Artist implements InterfaceAvlTree {
    private static int countArtists = 0;

    private int id;
    private String name;
    private String genre;
    private String country;

    public Artist() {
        this.id = countArtists++;
        // add input logic
    }

    public int getKey() {
        return id;
    }

    public Artist(String name, String genre, String country) {
        this.id = countArtists++;
        this.name = name;
        this.genre = genre;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Artist:" + this.id +  " - " + this.name + " - " + this.genre + " - " + this.country;
    }
}
