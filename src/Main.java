import AVLTree.AvlTree;
import AVLTree.Node;
import genericCRUD.GenericCRUD;
import model.Music;

import java.util.Scanner;

public class Main {
    public static void MenuAlbum() {

    }

    public static void MenuArtista() {

    }

    public static void MenuMusica() {
    }

    public static void MenuPlaylist() {
    }

    public static void MenuUsuarios() {
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("[Menu Principal]");
            System.out.println("[1] Gerenciar album");
            System.out.println("[2] Gerenciar artista");
            System.out.println("[3] Gerenciar música");
            System.out.println("[4] Gerenciar playlist");
            System.out.println("[5] Gerenciar usuários");
            System.out.println("[7] Sair");

            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> MenuAlbum();
                case 2 -> MenuArtista();
                case 3 -> MenuMusica();
                case 4 -> MenuPlaylist();
                case 5 -> MenuUsuarios();
                case 6 -> System.out.println("Saindo do sistema...");
                return;
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

    /*
    Music m1 = new Music(215, "Lost in the Echo");      // 03:35
        Music m2 = new Music(182, "Midnight City");         // 03:02
        Music m3 = new Music(249, "Blinding Lights");       // 04:09
        Music m4 = new Music(301, "Numb");                  // 05:01
        Music m5 = new Music(194, "Radioactive");           // 03:14


        GenericCRUD<Music> music =  new GenericCRUD<>();
        music.
        music.ShowAllItems();

        // Search
        Node<Music> node = AVLMusic.search(AVLMusic.root, m4.getKey());
        //System.out.println(AVLMusic.getSearchCount());
        //AVLMusic.resetSearchCount();

        String result = AVLMusic.printParentheses(AVLMusic.root);
        System.out.println(result);

     */
    }
}