package com.bridgelabs.day15_hashtable_bst;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 15 hashtable and binary search tree program");
            MyHashMap<String,Integer> myHashmap=new MyHashMap<>();
            String sentence="To be or not to be";
            String[] wordArray=sentence.split(" ");
            System.out.println("The frequency of words in the given sentence 'To be or not to be as follows'");
            for (String word : wordArray) {
                myHashmap.put(word, 1);
            }
            myHashmap.print();
    }
}
