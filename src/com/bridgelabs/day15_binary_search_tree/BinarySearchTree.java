package com.bridgelabs.day15_binary_search_tree;

public class BinarySearchTree<K extends Comparable> {
    MyBinaryNode<K> root;

    public void add(K key){
        addRecursive(key, root);
    }
    public void addRecursive(K key, MyBinaryNode currentNode){
        if (root == null){
            root=new MyBinaryNode(key);
            System.out.println(key+" assigned to root");
        } else if (currentNode.left==null && key.compareTo(currentNode.getKey()) <= 0) {
            currentNode.left=new MyBinaryNode(key);
            System.out.println(key+" assigned left to "+currentNode.getKey());
        } else if (key.compareTo(currentNode.getKey()) <= 0) {
            currentNode=currentNode.left;
            addRecursive(key,currentNode);
        } else if (currentNode.right == null) {
            currentNode.right=new MyBinaryNode(key);
            System.out.println(key+" assigned right to "+currentNode.getKey());
        } else {
            currentNode=currentNode.right;
            addRecursive(key,currentNode);
        }
    }
    public MyBinaryNode<K> search(K key){
        return search_recursive(key,root);
    }
    public MyBinaryNode<K> search_recursive(K key, MyBinaryNode<K> currentNode){
        if (currentNode.getKey().equals(key)){
            System.out.println("found: "+currentNode.getKey());
            return currentNode;
        } else if (currentNode.getKey().compareTo(key) > 0) {
            currentNode=currentNode.left;
            search_recursive(key,currentNode);
        }else {
            currentNode=currentNode.right;
            search_recursive(key,currentNode);
        }
        return currentNode;
    }
}