package DataStructure;

import com.Utility.Utility;

public class CalendarStack {
    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter the month:");
        int month=Utility.inputInt();
        System.out.println("Enter the Year:");
        int year=Utility.inputInt();
        Utility.calendarStack(month, year);
    }
}
