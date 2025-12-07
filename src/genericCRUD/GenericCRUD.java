package genericCRUD;

import AVLTree.AvlTree;
import AVLTree.Node;
import Interfaces.InterfaceAvlTree;

import java.util.ArrayList;
import java.util.List;

public class GenericCRUD<T extends InterfaceAvlTree> {
    AvlTree<T> tree;

    public GenericCRUD(){
        this.tree = new AvlTree<T>();
    }

    public T AddItem(T item) {
        tree.insert(item);

        return item;
    }

    public T DeleteItem(T item) {
        tree.delete(item.getKey());

        return item;
    }

    public T FindItem(int key) {
        Node<T> node = tree.search(tree.root, key);

        T item = node.value;

        return item;
    }

    public T UpdateItem(int key) {
        T itemToBeUpdated = FindItem(key);

        itemToBeUpdated.update();

        return itemToBeUpdated;
    }

    public List<T> GetABunchOfItems(int[] listOfItems) {
        List<T> items = new ArrayList<>();
        for(int  i : listOfItems) {
            items.add(FindItem(i));
        }
        return items;
    }

    public void ShowItem(T item) {
        System.out.println(item);
    }

    public void ShowAllItems() {
        System.out.println(tree.printParentheses(this.tree.root));
    }
}
