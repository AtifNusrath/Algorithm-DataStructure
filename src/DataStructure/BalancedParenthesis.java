package DataStructure;

import com.Utility.Utility;

public class BalancedParenthesis {
    public static void main(String[] args) {
        new Utility();
        System.out.println("Enter the Expression:");
        String exp=Utility.inputString();
        Utility.BalanceParanthesis(exp);
    }
}
