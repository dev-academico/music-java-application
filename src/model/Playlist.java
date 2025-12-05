package model;

import Interfaces.InterfaceAvlTree;

import java.util.Scanner;

public class Playlist implements InterfaceAvlTree {
    static private int countPlaylists = 0;

    private int id;
    private String name;
    private String description;

    public Playlist() {
       this.id = countPlaylists++;
    }

    public int getKey() {
        return id;
    }

    public void update(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Atualizando playlist...");
        System.out.print("Nome da playlist: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição da playlist: ");
        String descricao = scanner.nextLine();

        this.name = nome;
        this.description = descricao;
        System.out.println("Playlist atualizada com sucesso!");
    }

    public Playlist(String name, String description) {
        this.id = countPlaylists++;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Playlist:" + this.id + " - " + this.name + " - " + this.description ;
    }
}
