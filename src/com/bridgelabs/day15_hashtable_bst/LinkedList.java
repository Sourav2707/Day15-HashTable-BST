package com.bridgelabs.day15_hashtable_bst;

public class LinkedList<K, V> {
    MyMapNode head;
    MyMapNode tail;

    public void append(MyMapNode<K, V> node) {
        if (head == null) {
            head = (MyMapNode) node;
        } else {
            tail.setNext(node);
        }
        tail = (MyMapNode) node;
    }

    public MyMapNode search(K key) {
        if (head == null) {
            return null;
        } else {
            MyMapNode node = head;
            while (!node.getKey().equals(key)) {
                if (node == tail && !node.getKey().equals(key)) {
                    return null;
                }
                node = node.getNext();
            }
            return node;
        }

    }
    public MyMapNode remove(K key){
        MyMapNode deleteNode=search(key);
        MyMapNode previousNode=head;
        if (deleteNode != null){
            while (!previousNode.getNext().equals(deleteNode)){
                previousNode=previousNode.getNext();
            }
            previousNode.setNext(deleteNode.getNext());
            return deleteNode;
        }else {
            return null;
        }
    }
    public void print() {
        MyMapNode myMapNode = head;
            while (!(myMapNode == null)) {
                System.out.print(myMapNode.getKey() + " ");
                myMapNode = myMapNode.getNext();
            }
    }
}
