package com.bridgelabz;


import com.Utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchWordList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println("Enter the size of list:");
        int n = Utility.inputInt();
        System.out.println("Enter values in to the list:");
        for (int i = 0; i < n; i++) {
            list.add(Utility.inputString());
        }
        String[] array = new String[list.size()];
        array = list.toArray(array);
        System.out.println("Enter word to search: ");
        String word = Utility.inputString();
        Utility.BinarySearch(array,word);
    }
}
