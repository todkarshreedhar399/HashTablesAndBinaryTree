


package com.bridgelabz;

public class MyBinaryTree <K extends Comparable<K>> {
    BinaryNode<K> root;

    public void add(int Key) {
        BinaryNode<K> newNode = new BinaryNode<K>(Key);
        if (root == null) {
            root = newNode;
            return;
        } else {
            BinaryNode<K> current = root;
            BinaryNode<K> parent = null;
            while (true) {
                parent = current;

                if (Key < current.key) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    
    public void print(BinaryNode<K> node) {
        if (node.left != null)
            print(node.left);
        System.out.print(node.key + " ");
        if (node.right != null)
            print(node.right);

    }

    public BinaryNode<K> search(BinaryNode<K> root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key > key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public boolean searchNode(int value) {
        root = search(root, value);
        if (root != null)
            return true;
        else
            return false;
    }
}



