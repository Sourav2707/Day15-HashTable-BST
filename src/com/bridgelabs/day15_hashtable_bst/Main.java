package com.bridgelabs.day15_hashtable_bst;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 15 hashtable and binary search tree program");
            MyHashMap<String,Integer> myHashmap=new MyHashMap<>();
<<<<<<< HEAD
            String sentence="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
=======
            String sentence="To be or not to be";
>>>>>>> UC1_BST_Adding
            String[] wordArray=sentence.split(" ");
            System.out.println("The frequency of words in the given sentence 'To be or not to be as follows'");
            for (String word : wordArray) {
                myHashmap.put(word, 1);
            }
            myHashmap.print();
<<<<<<< HEAD
        System.out.println("\n");
            myHashmap.remove("avoidable");
        System.out.println("");
            myHashmap.print();
=======
>>>>>>> UC1_BST_Adding
    }
}
