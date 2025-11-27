import AVLTree.AvlTree;
import AVLTree.Node;
import model.Music;

public class Main {
    public static void main(String[] args) {
        Music m1 = new Music(215, "Lost in the Echo");      // 03:35
        Music m2 = new Music(182, "Midnight City");         // 03:02
        Music m3 = new Music(249, "Blinding Lights");       // 04:09
        Music m4 = new Music(301, "Numb");                  // 05:01
        Music m5 = new Music(194, "Radioactive");           // 03:14

        AvlTree<Music> AVLMusic = new AvlTree<Music>();

        AVLMusic.insert(m1);
        AVLMusic.insert(m2);
        AVLMusic.insert(m3);
        AVLMusic.insert(m4);
        AVLMusic.insert(m5);

        // Search
        Node<Music> node = AVLMusic.search(AVLMusic.root, m4.getKey());
        System.out.println(AVLMusic.getSearchCount());
        AVLMusic.resetSearchCount();

        System.out.println(node.value);
    }
}