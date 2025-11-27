package AVLTree;

public class Node<T> {
    public T value;

    public int key;
    public int height;

    public Node<T> left;
    public Node<T> right;

    public Node(int key, T value) {
        this.key = key;
        this.value = value;
        this.height = 1;
    }
}