package model;

import Interfaces.InterfaceAvlTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Album implements InterfaceAvlTree {
    private static int countAlbums = 0;

    private int id;
    private int year;
    private String name;
    private Artist artist;
    private List<Music> albumMusics = new ArrayList<>();

    public Album() {
        this.id = countAlbums++;
    }

    public Album(String name, Artist artist, int year,  List<Music> albumMusics) {
        this.id = countAlbums++;
        this.name = name;
        this.artist = artist;
        this.year = year;
        this.albumMusics = albumMusics;
    }

    public int getKey() {
        return id;
    }

    public void update() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do álbum: ");
        this.name = scanner.nextLine();

        System.out.print("Ano de lançamento: ");
        this.year = Integer.parseInt(scanner.nextLine());

        System.out.println("Álbum atualizado com sucesso!");
    }

    @Override
    public String toString() {
        String userInfo = (this.artist != null) ? this.artist.getName() + " (ID: " + this.artist.getKey() + ")" : "Nenhum artista.";
        return "Album: " + this.id + "\nName: " + this.name + "\nAno: " + this.year + "\nArtist: " + userInfo + "\nList of songs:" + this.albumMusics.toString();
    }
}
