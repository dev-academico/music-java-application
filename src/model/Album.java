package model;

import Interfaces.InterfaceAvlTree;

import java.util.Scanner;

public class Album implements InterfaceAvlTree {
    private static int countAlbums = 0;

    private int id;
    private int year;
    private String name;
    private String artist;

    public Album() {
        this.id = countAlbums++;
    }

    public Album(String name, String artist, int year) {
        this.id = countAlbums++;
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    public int getKey() {
        return id;
    }

    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Atualizando álbum...");

        System.out.print("Nome do álbum: ");
        this.name = scanner.nextLine();

        System.out.print("Nome do artista: ");
        this.artist = scanner.nextLine();

        System.out.print("Ano de lançamento: ");
        this.year = Integer.parseInt(scanner.nextLine());

        System.out.println("Álbum atualizado com sucesso!");
    }

    @Override
    public String toString() {
        return "Album: " + this.id + " - " + this.name + " - " + this.artist + " - " + this.year;
    }
}
