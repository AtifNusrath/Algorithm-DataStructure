package DataStructure;

import com.Utility.Utility;

public class Calendar {
    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter the Month:");
        int month=Utility.inputInt();
        System.out.println("Enter the Year:");
        int year=Utility.inputInt();
        Utility.Calendar(month, year);
    }
}
