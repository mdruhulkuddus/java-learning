package JavaBasics;

import java.util.Scanner;
import java.util.Stack;

public class FnBracketBalanceChecker {
    public boolean isBalanced(String input) {
        if (input.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '(') {
                stk.push(c);
            } else if (c == ')' && (stk.isEmpty() || stk.pop() != '(')) {
                return false;
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        FnBracketBalanceChecker checker = new FnBracketBalanceChecker();
        if (checker.isBalanced(str)) {
            System.out.println("Balanced!");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
