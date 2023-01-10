package ccom.bridgelabs.day15_hashtable_bst;

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

    public void print() {
        MyMapNode myMapNode = head;
            while (!(myMapNode == null)) {
                System.out.println(myMapNode.getKey() + " = " + myMapNode.getValue());
                myMapNode = myMapNode.getNext();
            }
    }
}
