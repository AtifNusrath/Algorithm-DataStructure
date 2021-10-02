package DataStructure;

import com.Utility.Utility;

public class PalindromeChecker {
    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter the String:");
        String string=Utility.inputStringLine().toLowerCase().replaceAll(" ", "");
        Utility.isPalindromeChecker(string);
    }
}
