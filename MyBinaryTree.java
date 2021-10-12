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
                }

                else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    /*Print method
    *If left node is not equal to null print left node
    * Print root node
    * If left node is not equal to null print right node
     */
    public void print(BinaryNode<K> node) {
            if (node.left != null)
                print(node.left);
            System.out.print(node.key + " ");
            if (node.right != null)
                print(node.right);

        }
    }
