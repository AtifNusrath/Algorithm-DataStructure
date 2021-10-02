package com.bridgelabz;

import java.util.Scanner;

public class BinarySearch {

        static int binarySearch(String[] arr , String str)
        {
            int r = arr.length - 1;
            int l = 0;

            while(l<=r)
            {
                int mid = l + (r-l)/2;

                int x = str.compareTo(arr[mid]);

                if(x == 0)
                    return mid;

                if(x < mid)
                    l = mid+1;
                else
                    l = mid-1;

            }return -1;
        }

        public static void main(String[] args)
        {

            Scanner x =new Scanner(System.in);
            System.out.println("Enter string size");
            int n = x.nextInt();
            String[] array = new String[n];

            System.out.println("Enter string");

            for (int i = 0; i < n; i++){

                array[i] = x.next();
            }

            System.out.println("Enter the search string : ");
            String key  = x.next();

            BinarySearch obj = new BinarySearch();
            int value = obj.binarySearch( array, key );

            if(value == -1)
                System.out.println("element not found" );
            else
                System.out.println("index : "+ value);
        }

    }

