package com.bridgelabs.day15_hashtable_bst;

public interface INode<K> {

    public K getKey();
    public void setKey(K key);
    public INode<K> getNext() ;
    public void setNext(INode next);
}
