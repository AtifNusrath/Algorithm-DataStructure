package com.bridgelabz;

import com.Utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        new Utility();
        List<Integer> list= new ArrayList<>();
        System.out.println("Enter the size of list:");
        int n=Utility.inputInt();
        System.out.println("Enter values in to the list:");
        for(int i=0;i<n;i++)
        {
            list.add(Utility.inputInt());
        }
        Integer[] array=new Integer[list.size()];
        array=list.toArray(array);
        Utility.bubbleSort(array);
    }
}
