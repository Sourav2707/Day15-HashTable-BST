package com.bridgelabs.day15_binary_search_tree;

public class BinarySearchTree<K extends Comparable> {
    MyBinaryNode<K> root;

    public void add(K key) {
        MyBinaryNode myBinaryNode = new MyBinaryNode(key);
        if (root == null) {
            root = myBinaryNode;
            System.out.println(myBinaryNode.getKey()+" assigned to root");
        } else {
            MyBinaryNode currentNode=root;

            while (true){
                if (currentNode.left==null && key.compareTo(currentNode.getKey()) <= 0) {
                    currentNode.left=new MyBinaryNode(key);
                    System.out.println(key+" assigned left to "+currentNode.getKey());
                    break;
                } else if (key.compareTo(currentNode.getKey()) <= 0) {
                    currentNode=currentNode.left;
                } else if (currentNode.right == null) {
                    currentNode.right=new MyBinaryNode(key);
                    System.out.println(key+" assigned right to "+currentNode.getKey());
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
    }
}