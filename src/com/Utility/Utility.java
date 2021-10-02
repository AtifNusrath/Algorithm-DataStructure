package com.Utility;

import DataStructure.Queue;
import java.io.*;
import java.util.*;


public class Utility {
    static Scanner scanner = new Scanner(System.in);

    // To return String Input
    public static String inputString() {

        try {
            return scanner.next();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input, try again.");
            return inputString();
        }
    }


    //To return String Input Line
    public static String inputStringLine() {

        try {
            return scanner.nextLine();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input, try again.");
            return inputStringLine();
        }
    }


    //To return Integer input
    public static int inputInt() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input, try again.");
            return inputInt();
        }

    }

    //To return Double input
    public static double inputDouble() {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input, try again.");
            return inputDouble();
        }

    }

    //To return Boolean input;
    public static boolean inputBoolean() {
        try {
            return scanner.nextBoolean();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Invalid input, try again.");
            return inputBoolean();
        }
    }


    //Method for String Permutation
    public static void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    //swap
    public static String swap(String str, int i, int j) {
        char charArray[] = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);

    }

    //Method for Anagram String
    public static boolean Anagram(String str1, String str2) {
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        boolean isAnagram = false;
        isAnagram = Arrays.equals(string1, string2);
        if (isAnagram == true) {
            //pSystem.out.println(str1+" , "+str2+" are Anagram Strings");
            return isAnagram;
        } else
            //System.out.println(str1+" , "+str2+" are not Anagram Strings");
            return isAnagram;

    }

    //To check number is prime or not
    public static boolean isPrime(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] prime(int range) {
        String[] array = new String[1000];
        int position = 0;
        for (int i = 2; i <= range; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if ((i % j) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                array[position] = String.valueOf(i);
                position++;
            }
        }
        String[] returnArray = new String[position];
        for (int k = 0; k < position; k++) {
            returnArray[k] = array[k];
        }
        return returnArray;
    }

    //Method for Prime Numbers
    public static int[] primeNumbers(int n) {
        int a[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                a[k] = i;
                k++;
            }
        }
        int len = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                len++;
        }

        int[] newArray = new int[len];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                newArray[j] = a[i];
                j++;
            }
        }
        System.out.println();

              /*  for (int integer : newArray) {
                    System.out.println(integer);
                } */
        return newArray;


    }

    public static boolean anagram(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        char[] array1 = string1.toCharArray();
        Arrays.sort(array1);
        char[] array2 = string2.toCharArray();
        Arrays.sort(array2);

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome(String string) {
        if (string.length() < 2) {
            return false;
        }
        char[] array = string.toCharArray();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] != array[n - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    //Method to display array
    public static void display(int array[]) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    //Method to display anagram
    public static void displayangaram(boolean status) {
        if (status) {
            System.out.println("Is Anagram");
        } else
            System.out.println("Is Not Anagram");
    }

    //Method for integer anagram
    public static boolean AnagramInteger(int n1, int n2) {

        String num1 = String.valueOf(n1);
        String num2 = String.valueOf(n2);
        boolean status = Anagram(num1, num2);
        return status;
    }

    //Method to search integer using binary search
    public static <T extends Comparable<T>> void BinarySearch(T[] array, T search) {
        bubbleSort(array);
        int length = array.length;
        int first = 0;
        int last = length - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;
            if (array[mid].compareTo(search) < 0) {
                first = mid + 1;
            } else if (array[mid].compareTo(search) == 0) {
                System.out.println("\n" + search + " found in location " + mid);
                break;
            } else if (array[mid].compareTo(search) > 0) {
                last = mid - 1;
            }
        }
        if (first > last) {
            System.out.println(search + "Not found");
        }


    }

    //Method For Insertion Sort
    public static <T extends Comparable<T>> void insertionSort(T array[]) {
        int length = array.length;
        int j;
        T temp;
        for (int i = 0; i < length; i++) {
            j = i;
            temp = array[i];
            while (j > 0 && temp.compareTo(array[j - 1]) < 0) {//
                array[j] = array[j - 1];
                j = j - 1;
            }
            array[j] = temp;//insert unsorted element
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Method for Bubble Sort
    public static <T extends Comparable<T>> void bubbleSort(T array[]) {
        int length = array.length;


        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //Method for merge sort
    public static <T extends Comparable<T>> void mergeSort(T a[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Comparable<T>> void merge(T a[], int start, int mid, int end) {
        int p = start, q = mid + 1;
        Object[] arr1 = new Object[end - start + 1];
        int k = 0;
        for (int i = start; i <= end; i++) {
            if (p > mid) {
                arr1[k++] = a[q++];
            } else if (q > end) {
                arr1[k++] = a[p++];
            } else if (a[p].compareTo(a[q]) < 0) {
                arr1[k++] = a[p++];
            } else {
                arr1[k++] = a[q++];
            }
        }
        for (int l = 0; l < k; l++) {
            a[start++] = (T) arr1[l];
        }
        System.out.println("After Sorting:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    //Find Your Number
    public static int search(int low, int high) {
        if (low > high) {
            return -1;
        } else if (low == high) {
            return low;
        }
        int mid = (low + high) / 2;
        System.out.println("Is you number between " + low + " and " + mid);
        boolean flag = true;
        if (flag != Utility.inputBoolean()) {
            low = mid + 1;
        } else {
            high = mid;
        }
        return search(low, high);
    }


    //Method to find day of a week
    public static int dayOfWeek(int m, int d, int y) {

        int y1 = y - (14 - m) / 12;
        int x = y1 + y1 / 4 - y1 / 100 + y1 / 400;
        int m1 = m + 12 * ((14 - m) / 12) - 2;
        int d1 = (d + x + 31 * m1 / 12) % 7;
        //System.out.println(d1);
        return d1;
    }

    //Method to balance expression
    public static void BalanceParanthesis(String exp) {
        Stack s = new Stack();
        char e[] = exp.toCharArray();
        int explen = exp.length();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < explen; i++) {
            if (e[i] == '(') {
                s.push(e[i]);
                count1++;
            } else if (e[i] == ')') {
                s.pop();
                count2++;
            }
        }
        if (count1 == count2) {
            System.out.println("Expression is valid");
        } else {
            System.out.println("Expression is invalid");
        }
    }



    //PalindromeCheck
   public static void isPalindromeChecker(String string) {
        Dequeue d = new Dequeue();
        boolean status = false;
        char[] array = string.toCharArray();
        char first;
        char last;
        for (int i = 0; i < array.length; i++) {
            d.addRear(array[i]);
        }
        /*int size=d.size();
        System.out.println(size);*/
        while (d.size() > 1) {
            first = d.removeFront();
            last = d.removeRear();
            System.out.println(first);
            System.out.println(last);
            if (first != last) {
                status = false;
                break;
            } else
                status = true;
        }
        if (status == true) {
            System.out.println("Is a palindrome");
        } else
            System.out.println("Not a palindrome");
    }



    //Method for Banking counter
    public static void bankCounter() {
        Queue q = new Queue();
        System.out.println("Enter your choice:");
        System.out.println("1. To add in queue");
        System.out.println("2. To do transaction");
        int choice = inputInt();
        int option;
        double sum = 0;
        while (choice == 1 && q.size() < q.capacity) {

            q.enqueue(choice);
            System.out.println("Enter your choice:");
            System.out.println("1. To add in queue");
            System.out.println("2. To do transaction");
            option = inputInt();
            if (option == 1)
                choice = option;
            else
                choice = option;
        }
        while (choice == 2 && (q.size() < q.capacity)) {
            if (q.isEmpty()) {
                System.out.println("Please add into queue First");
                System.out.println("Enter your choice:");
                System.out.println("1. To add in queue");
                System.out.println("2. To do transaction");
                option = inputInt();
                if (option == 1)
                    q.enqueue(1);
                else
                    choice = option;
            } else {
                System.out.println("Choose Your Transaction:");
                System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Add in queue again\n5.No. of ppl in queue");
                int select = Utility.inputInt();

                switch (select) {
                    case 1:
                        System.out.println("Enter Your Amount:");
                        double amountdepo = inputDouble();
                        sum = bankDeposit(amountdepo, sum);
                       // q.dequeue();
                        break;
                    case 2:
                        System.out.println("Enter Your Amount:");
                        double amountwith = inputDouble();
                        sum = bankWithdraw(amountwith, sum);
                        q.dequeue();
                        break;
                    case 3:
                        System.out.println("Balance is:" + sum);
                        q.dequeue();
                        break;
                    case 4:
                        q.enqueue(1);
                        break;
                    case 5:
                        int size = q.size();
                        System.out.println("Number of ppl in the queue are:" + size);
                    default:
                        break;
                }
            }
        }
    }

    //Method to deposit
   public static double bankDeposit(double amount, double sum) {
        System.out.println("Amount deposited is:" + amount);
        sum = sum + amount;
        System.out.println("Total amount" + sum);
        return sum;
    }

    //Method to withdraw
    public static double bankWithdraw(double amount, double sum) {
        System.out.println("Amount withdrawn is:" + amount);
        sum = sum - amount;
        System.out.println("Total amount" + sum);
        return sum;
    }

    //Method for 2D Prime Array
    public static int[] Prime2D() {
        int[][] a = new int[10][30];
        int b[] = new int[250];
        int k = 0;
        int c = 0;

        while (c < 250) {
            if (isPrime(k)) {
                b[c] = k;
                c++;
            }
            k++;
        }
        int v = 0;
        for (int i = 0; i < 10; i++) {
            int max = 100;
            for (int j = 0; j < 30; j++) {
                if (b[v] < (i + 1) * max) {
                    a[i][j] = b[v];
                    v++;
                }
            }
        }
        int start = 0, end = 1;
        for (int i = 0; i < 10; i++) {
            end = (i + 1) * 100;
            System.out.print("[" + start + "-" + end + "]");
            start = 1 + end;
            for (int j = 0; j < 30; j++) {
                if (a[i][j] > 0) {

                    System.out.print(a[i][j] + "\t");
                }
            }
            System.out.println();
        }
        return b;
    }

    //Method for 2D Prime Anagram
    public static int[][] PrimeAnagram2D() {
        int array[] = Prime2D();
        int n1 = 0;
        int n2 = 0;
        int k = 0;
        boolean status = false;
        int newarray[] = new int[300];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                n1 = array[i];
                n2 = array[j];
                status = AnagramInteger(n1, n2);
                if (status == true) {
                    newarray[k++] = n1;
                    newarray[k++] = n2;

                }
            }
        }
        int v = 0;
        int a[][] = new int[10][30];
        for (int i = 0; i < 10; i++) {
            int max = 100;
            for (int j = 0; j < 30; j++) {
                if (array[v] < (i + 1) * max) {
                    a[i][j] = newarray[v];
                    v++;
                }
            }
        }
        System.out.println("-------------------------------");
        System.out.println("Prime Numbers that are Anagram");
        System.out.println("-------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
                if (a[i][j] > 0 && a[i][j] < 1000) {

                    System.out.print(a[i][j] + "\t");
                }
            }
            System.out.println();
        }
        return a;
    }

    //Method for Prime Anagram in Stack
   public static void StackPrimeAnagram() {

        int array[][] = PrimeAnagram2D();
        StackLinkList stack = new StackLinkList();
        System.out.println("----------------------------------");
        System.out.println("Prime Anagram in reverse order using Stack");
        System.out.println("----------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
                if (array[i][j] > 0 && array[i][j] < 1000) {
                    stack.insert(array[i][j] + "\t");
                    //System.out.print(a[i][j]+"\t");
                }

            }
            stack.insert("\n");
        }
        stack.display();
    }

    //Method for Prime Anagram in Queue
    public static void QueuePrimeAnagram() {

        int array[][] = PrimeAnagram2D();
        QueueLinkList queue = new QueueLinkList();
        System.out.println("----------------------------------");
        System.out.println("Prime Anagram using Queue");
        System.out.println("----------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
                if (array[i][j] > 0 && array[i][j] < 1000) {
                    queue.insert(array[i][j] + "\t");
                    //System.out.print(a[i][j]+"\t");
                }
            }
            queue.insert("\n");
        }
        queue.display();
    }
    public static boolean isLeapOrNot(int year)
    {
        if(year%4==0 || year%400==0 && year%100!=0)
        {
            System.out.println("Is a Leap Year");
            return true;
        }
        else
        {
            System.out.println("Is not a Leap Year");
            return false;
        }

    }

    //Method for CalendarQueue
   public static void CalendarQueue(int month, int year) {
        QueueLinkList weekday = new QueueLinkList();
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((month == 2) && (isLeapOrNot(year))) {
            days[month] = 29;
        }
        System.out.println("\t\t\t" + months[month - 1] + " " + year);
        System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
        int d = dayOfWeek(month, 1, year);
        for (int i = 0; i < d; i++) {
            weekday.insert("\t");
        }
        for (int i = 1; i <= days[month - 1]; i++) {
            //System.out.printf("%2d ", i);
            weekday.insert("\t" + i);
            if (((i + d) % 7 == 0) || (i == days[month - 1]))
                weekday.insert("\n");
        }
        weekday.display();
    }

    public static void Calendar(int month, int year)
    {

        String[] months = {"January", "February", "March","April", "May", "June",
                "July", "August", "September","October", "November", "December"};

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((month == 2) && (isLeapOrNot(year)))
        {
            days[month] = 29;
        }

        System.out.println("\t" + months[month-1] + " " + year);
        System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
        int d = dayOfWeek(month, 1, year);
        for (int i = 0; i < d; i++) {
            System.out.print("\t");
        }

        for (int i = 1; i <= days[month-1]; i++) {
            System.out.printf("%3d ", i);
            if (((i + d) % 7 == 0) || (i == days[month-1]))
                System.out.println();
        }
    }

    // Method for Calendar Stack
    public static void calendarStack(int month, int year) {
        StackLinkList weekdayIn = new StackLinkList();
        StackLinkList weekdayOut = new StackLinkList();
        String[] months = {"", "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((month == 2) && (isLeapOrNot(year))) {
            days[month] = 29;
        }
        System.out.println("\t\t\t" + months[month] + " " + year);
        System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
        int d = dayOfWeek(month, 1, year);
        for (int i = 0; i < d; i++) {
            weekdayIn.insert("\t");
        }
        for (int i = 1; i <= days[month]; i++) {
            weekdayIn.insert("\t" +i);
            if (((i + d) % 7 == 0) || (i == days[month - 1]))
                weekdayIn.insert("\n");
        }
        for (int i = 1; i <= weekdayIn.size(); i++) {
            Object value = weekdayIn.delete();
            System.out.println(value);
            weekdayOut.insert("\n");

        }
        weekdayOut.display();

    }
}



