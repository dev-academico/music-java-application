package model;

import Interfaces.InterfaceAvlTree;

import java.util.Scanner;

public class Artist implements InterfaceAvlTree {
    private static int countArtists = 0;

    private int id;
    private String name;
    private String genre;
    private String country;
    private String cpf;

    public Artist() {
        this.id = countArtists++;

        // add input logic
    }

    public int getKey() {
        return id;
    }

    public void update(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Atualizando artista...");
        System.out.print("Nome do artista: ");
        String nome = scanner.nextLine();

        System.out.print("Nome do genero: ");
        String genero = scanner.nextLine();

        System.out.print("Nome do país: ");
        String country = scanner.nextLine();

        this.name = nome;
        this.genre = genero;
        this.country = country;

        System.out.println("Artista atualizado com sucesso!");

    }

    public Artist(String name, String genre, String country, String cpf) {
        this.id = countArtists++;
        this.name = name;
        this.genre = genre;
        this.country = country;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Artist:" + + this.id + " - " + this.cpf + " - " + this.name + " - " + this.genre + " - " + this.country;
    }
}
