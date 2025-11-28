package AVLTree;

import Interfaces.InterfaceAvlTree;

public class AvlTree<T extends InterfaceAvlTree> {

    public Node<T> root = null;
    static int searchCount = 0;

    public int getSearchCount() {
        return searchCount;
    }

    public void resetSearchCount() {
        searchCount = 0;
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    Node rightRotate(Node node) {
        Node leftChild = node.left;
        Node temp = leftChild.right;

        // Perform rotation
        leftChild.right = node;
        node.left = temp;

        // Update heights
        node.height = max(height(node.left), height(node.right)) + 1;
        leftChild.height = max(height(leftChild.left), height(leftChild.right)) + 1;

        return leftChild;
    }

    Node leftRotate(Node node) {
        Node rightChild = node.right;
        Node temp = rightChild.left;

        // Perform rotation
        rightChild.left = node;
        node.right = temp;

        // Update heights
        node.height = max(height(node.left), height(node.right)) + 1;
        rightChild.height = max(height(rightChild.left), height(rightChild.right)) + 1;

        return rightChild;
    }

    int getBalance(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    public Node insert(Node node, int key, T value) {

        if (node == null)
            return new Node(key, value);

        if (key < node.key)
            node.left = insert(node.left, key, value);
        else if (key > node.key)
            node.right = insert(node.right, key, value);
        else
            return node;

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // RR
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // LR
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public Node search(Node node, int key) {
        searchCount++;

        if (node == null)
            return null;

        if (key < node.key)
            return search(node.left, key);
        else if (key > node.key)
            return search(node.right, key);
        else {
            return node;
        }
    }

    Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null)
            current = current.left;
        return current;
    }

    public Node delete(Node node, int key) {

        if (node == null)
            return null;

        if (key < node.key)
            node.left = delete(node.left, key);
        else if (key > node.key)
            node.right = delete(node.right, key);
        else {

            if (node.left == null || node.right == null) {
                Node temp = (node.left != null) ? node.left : node.right;

                if (temp == null) {
                    return null; // Nó sem filhos
                } else {
                    return temp; // Nó com 1 filho
                }
            }
            else {
                Node temp = minValueNode(node.right);
                node.key = temp.key;
                node.right = delete(node.right, temp.key);
            }
        }

        // Atualiza altura
        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL
        if (balance > 1 && getBalance(node.left) >= 0)
            return rightRotate(node);

        // LR
        if (balance > 1 && getBalance(node.left) < 0) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RR
        if (balance < -1 && getBalance(node.right) <= 0)
            return leftRotate(node);

        // RL
        if (balance < -1 && getBalance(node.right) > 0) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void insert(T value) {
        this.root = insert(this.root, value.getKey(), value);
    }

    public String printParentheses(Node<T> root) {
        if (root == null) {
            return "";
        }

        // caso folha
        if (root.left == null && root.right == null) {
            return String.valueOf(root.key)+" " + String.valueOf(root.value);
        }

        String left = "";
        String right = "";

        if (root.left != null) {
            left = printParentheses(root.left);
        }

        if (root.right != null) {
            right = printParentheses(root.right);
        }

        if (root.left != null && root.right != null) {
            return root.key +" " + String.valueOf(root.value) + "(" + left + "," + right + ")";
        }

        if (root.left != null) {
            return root.key + " " +  String.valueOf(root.value) + "(" + left + ")";
        }

        return root.key + " " +  String.valueOf(root.value) + "(," + right + ")";
    }


    public void delete(int key) {
        this.root = delete(this.root, key);
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }

}
