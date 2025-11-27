package model;

import Interfaces.InterfaceAvlTree;

public class Music implements InterfaceAvlTree {
    static private int countMusics = 0;

    private int id;
    private int time;
    private String name;

    private Artist artist;

    public  Music() {
        // Add input logic
    }

    public int getKey() {
        return id;
    }

    public Music(int time, String name) {
        this.id = countMusics++;
        this.time = time;
        this.name = name;
    }

    public String FormatTime() {
        int minutes = this.time / 60;
        int seconds = this.time % 60;

        return String.format("%02d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        return "Music: " + this.name + " - " + FormatTime();
    }
}
