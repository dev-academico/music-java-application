package model;

import Interfaces.InterfaceAvlTree;

import java.util.Scanner;

public class User implements InterfaceAvlTree {
    private static int counterUsers = 0;

    private int id;
    private String cpf;
    private String name;
    private String email;
    private Playlist playlist;

    public User() {
        // Add input logic
    }

    public int getKey() {
        return id;
    }

    public void update(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Nome do email: ");
        String email = scanner.nextLine();

        this.name = nome;
        this.email = email;

        System.out.println("Usuário atualizado com sucesso!");
    }

    public User(String name, String email, String cpf) {
        this.id = counterUsers++;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }

    public String getName(){return this.name;}

    public void addPlaylist(Playlist playlist){
        this.playlist = playlist;
    }

    @Override
    public String toString() {
        String playlistInfo = (this.playlist != null) ? this.playlist.getName() + " (ID: " + this.playlist.getKey() + ")" : "Nenhuma playlist associada.";
        return "User:" + this.id + "\nCPF: " + this.cpf + "\nName: " + this.name + "\nEmail: " + this.email + "\nPlaylist: " + playlistInfo;
    }
}
