package model;

import Interfaces.InterfaceAvlTree;

import java.util.List;
import java.util.Scanner;

public class Playlist implements InterfaceAvlTree {
    static private int countPlaylists = 0;

    private int id;
    private String name;
    private String description;
    private List<Music> musics;
    private User user;

    public Playlist() {
       this.id = countPlaylists++;
    }

    public int getKey() {
        return id;
    }

    public String getName() { return name; }

    public void update(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome da playlist: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição da playlist: ");
        String descricao = scanner.nextLine();

        this.name = nome;
        this.description = descricao;
        System.out.println("Playlist atualizada com sucesso!");
    }

    public Playlist(String name, String description, User user, List<Music> musics) {
        this.id = countPlaylists++;
        this.name = name;
        this.description = description;
        this.musics = musics;
        this.user = user;
    }

    @Override
    public String toString() {
        String userInfo = (this.user != null) ? this.user.getName() + " (ID: " + this.user.getKey() + ")" : "Nenhum usuário.";
        return "Playlist:" + this.id + "\nName:" + this.name + "\nDescription: " + this.description + "\nUser: " + userInfo+ "\nList of songs: " + this.musics.toString();
    }
}
