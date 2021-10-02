package DataStructure;

import com.Utility.Utility;

public class CalendarQueue {
    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter the month:");
        int month=Utility.inputInt();
        System.out.println("Enter the year:");
        int year=Utility.inputInt();
        Utility.CalendarQueue(month,year);
    }
}
