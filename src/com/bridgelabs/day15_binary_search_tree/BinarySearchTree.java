package com.bridgelabs.day15_binary_search_tree;

public class BinarySearchTree<K extends Comparable> {
    MyBinaryNode<K> root;

    public void add(K key) {
        MyBinaryNode myBinaryNode = new MyBinaryNode(key);
        if (root == null) {
            root = myBinaryNode;
            System.out.println("  "+myBinaryNode.getKey()+"\n / \\");
        } else {
            MyBinaryNode node = root;

            while (true) {
                if (node.left == null) {
                    node.left = myBinaryNode;
                    System.out.println("/   \\\n"+myBinaryNode.getKey()+"   \\");
                    break;
                } else if (myBinaryNode.getKey().compareTo(node.left.getKey()) <= 0) {
                    node = node.left;
                } else if (node.right == null) {
                    node.right = myBinaryNode;
                    System.out.println("    "+myBinaryNode.getKey());
                    break;
                } else {
                    node = node.right;
                }
            }
        }
    }
}
