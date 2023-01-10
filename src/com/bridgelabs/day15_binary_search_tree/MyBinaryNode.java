package com.bridgelabs.day15_binary_search_tree;

public class MyBinaryNode<K extends Comparable> implements INode<K> {
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;
    public MyBinaryNode(K key) {
        this.key = key;
    }
    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }
}