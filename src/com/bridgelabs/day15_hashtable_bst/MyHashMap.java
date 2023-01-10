package com.bridgelabs.day15_hashtable_bst;

public class MyHashMap<K,V> {
    public static final int numOfBuckets=5;
    LinkedList<K,V>[] myBucketArray;

    public MyHashMap() {
        this.myBucketArray = new LinkedList[numOfBuckets];
        for (int i = 0; i < numOfBuckets ; i++) {
            myBucketArray[i]=new LinkedList<>();
        }
    }
    public void put(K key, V value){
        MyMapNode<K,V> myMapNode= new MyMapNode<>(key, value);
        int index=getIndex(myMapNode.getKey());

        if (myBucketArray[index]==null) {
            myBucketArray[index]= new LinkedList<>();
            myBucketArray[index].append((MyMapNode<K, V>) myMapNode);
        }else {
            MyMapNode myMapNode1= myBucketArray[index].search(key);
            if (myMapNode1 != null){
                myMapNode1.setValue( (V) (Integer)( (int)myMapNode1.getValue() + 1 ) );
            }else {
                myBucketArray[index].append((MyMapNode<K, V>) myMapNode);
            }
        }
    }
    public int getIndex(Object obj){
        int hashCode=Math.abs(obj.hashCode())%numOfBuckets;
        return hashCode;
    }
    public void remove(K key){
        int index=getIndex(key);
        myBucketArray[index].remove(key);
        System.out.println("Removed: "+key);
    }

    public void print(){
        for (LinkedList linkedList: myBucketArray) {
            linkedList.print();
        }
    }
}