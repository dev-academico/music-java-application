package model;

import Interfaces.InterfaceAvlTree;

import java.util.Scanner;

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

    public String getName() {return name;}

    public void update(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome da música: ");
        String nome = scanner.nextLine();

        System.out.print("Tempo de duração da música: ");
        int duracao = Integer.parseInt(scanner.nextLine());

        this.name = nome;
        this.time = duracao;

        System.out.println("Música atualizada com sucesso!");
    }

    public Music(int time, String name, Artist artist) {
        this.id = countMusics++;
        this.time = time;
        this.name = name;
        this.artist = artist;
    }

    public String FormatTime() {
        int minutes = this.time / 60;
        int seconds = this.time % 60;

        return String.format("%02d:%02d", minutes, seconds);
    }

    @Override
    public String toString() {
        String userInfo = (this.artist != null) ? this.artist.getName() + " (ID: " + this.artist.getKey() + ")" : "Nenhum artista.";
       return "Music:" + this.id + "\nName: " + this.name + "\nTime duration: " + FormatTime() + "\nArtist: " + userInfo;
    }
}
