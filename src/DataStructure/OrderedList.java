package DataStructure;

import com.Utility.Utility;

public class OrderedList {
    @SuppressWarnings("unchecked")
    public static <N> void main(String[] args) {
        new Utility();
        OrderedLinkedList<Integer> list;
       // list= Utility.OrderreadFileAndAddInList("/home/bridgeit/workspace/Files/NumberList");
        System.out.println("\nEnter the element to search");
        String search=Utility.inputString();

       // list=Utility.searchInListOrder(list, search);
       // Utility.OrderreadListWriteInFile("/home/bridgeit/workspace/Files/NumberList",list);
    }
}
