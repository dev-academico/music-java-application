import AVLTree.AvlTree;
import AVLTree.Node;
import genericCRUD.GenericCRUD;
import model.*;

import java.util.Scanner;



public class Main {
    public static GenericCRUD<Album> albumTree = new GenericCRUD<Album>();
    public static GenericCRUD<Artist> artistTree = new GenericCRUD<Artist>();
    GenericCRUD<Music> musicTree = new GenericCRUD<Music>();
    GenericCRUD<Playlist> playlistTree = new GenericCRUD<Playlist>();
    GenericCRUD<User> userTree = new GenericCRUD<User>();

    public static void MenuAlbum() {
        while (true) {
            System.out.println("[Menu Album]");
            System.out.println("[1 - C] Adicionar album");
            System.out.println("[2 - R] Listar albuns");
            System.out.println("[3 - U] Atualizar album");
            System.out.println("[4 - D] Deletar album");
            System.out.println("[5] Voltar para o menu principal");

            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> {
                    System.out.println("Adicionando album...");
                    while (true) {
                        try {
                            System.out.print("Nome do album: ");
                            String nome = scanner.nextLine();

                            System.out.print("Ano do album: ");
                            int ano = Integer.parseInt(scanner.nextLine());

                            System.out.println("Escolha um artista:");
                            artistTree.ShowAllItems();

                            int artistaEscolhido = Integer.parseInt(scanner.nextLine());
                            Artist artista = artistTree.FindItem(artistaEscolhido);

                            Album album = new Album(nome, artista, ano);
                            albumTree.AddItem(album);
                            System.out.println("Album adicionado com sucesso!");
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            System.out.println("Por favor, tente novamente.");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Listando albuns...");
                    albumTree.ShowAllItems();
                }
                case 3 -> {
                    System.out.println("Atualizando álbum...");
                    System.out.println("Escolha um album:");
                    albumTree.ShowAllItems();

                    int albumEscolhido = Integer.parseInt(scanner.nextLine());
                    albumTree.UpdateItem(albumEscolhido);
                }
                case 4 -> {
                    System.out.println("Deletando album...");
                    System.out.println("Escolha um album:");
                    albumTree.ShowAllItems();

                    int albumEscolhido = Integer.parseInt(scanner.nextLine());
                    Album album = albumTree.FindItem(albumEscolhido);
                    albumTree.DeleteItem(album);
                    System.out.println("Album removido com sucesso!");
                }
                case 5 -> {
                    System.out.println("Voltando para o menu principal...");
                    return;
                }
                default ->
                        System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void MenuArtista() {
        while (true) {
            System.out.println("[Menu Artista]");
            System.out.println("[1 - C] Adicionar artista");
            System.out.println("[2 - R] Listar artistas");
            System.out.println("[3 - U] Atualizar artista");
            System.out.println("[4 - D] Deletar artista");
            System.out.println("[5] Voltar para o menu principal");

            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1 -> {
                    System.out.println("Adicionando artista...");
                    while (true) {
                        try {
                            System.out.print("Nome do artista: ");
                            String nome = scanner.nextLine();

                            System.out.print("Genero musical do artista: ");
                            String genre = scanner.nextLine();

                            System.out.print("País do artista: ");
                            String country = scanner.nextLine();

                            System.out.print("CPF do artista: ");
                            String cpf = scanner.nextLine();

                            Artist artista = new Artist(nome, genre, country, cpf);
                            artistTree.AddItem(artista);
                            System.out.println("Artista adicionado com sucesso!");
                            break;
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            System.out.println("Por favor, tente novamente.");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Listando albuns...");
                    albumTree.ShowAllItems();
                }
                case 3 -> {
                    System.out.println("Atualizando álbum...");
                    System.out.println("Escolha um album:");
                    albumTree.ShowAllItems();

                    int albumEscolhido = Integer.parseInt(scanner.nextLine());
                    albumTree.UpdateItem(albumEscolhido);
                }
                case 4 -> {
                    System.out.println("Deletando album...");
                    System.out.println("Escolha um album:");
                    albumTree.ShowAllItems();

                    int albumEscolhido = Integer.parseInt(scanner.nextLine());
                    Album album = albumTree.FindItem(albumEscolhido);
                    albumTree.DeleteItem(album);
                    System.out.println("Album removido com sucesso!");
                }
                case 5 -> {
                    System.out.println("Voltando para o menu principal...");
                    return;
                }
                default ->
                        System.out.println("Opção inválida. Tente novamente.");
            }
        }

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