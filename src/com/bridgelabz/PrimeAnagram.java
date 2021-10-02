package com.bridgelabz;

import com.Utility.Utility;

public class PrimeAnagram {

    public static void main(String[] args) {

        //	prime numbers array between 0 and 1000
        String[] primeNumbers = Utility.prime(1000);

        System.out.println("Anagram and prime numbers are:");
        //	prints prime numbers that are anagrams
        for(int i = 0; i < primeNumbers.length; i++) {
            for(int j = i + 1; j < primeNumbers.length; j++) {
                if(Utility.anagram(primeNumbers[i], primeNumbers[j])) {
                    System.out.println(primeNumbers[i] + " " + primeNumbers[j]);
                }
            }
        }

        System.out.println("\nPalindrome and prime numbers are:");
        //	prints prime numbers that are palindrome
        for(int i = 0; i < primeNumbers.length; i++) {
            if(Utility.palindrome(primeNumbers[i])) {
                System.out.println(primeNumbers[i]);
            }
        }

    }
}
