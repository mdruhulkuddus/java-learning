package Collectionframework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        String[] brackets = {
                "()[])", "(()[])", "()()", "[["
        };

        for (String exp:brackets){
            String balanceStatus = isBalanced(exp) ? "Balanced" : "Not Balanced";
            System.out.println(exp + "  ==  " +balanceStatus);
        }
    }

    public static boolean isBalanced(String exp){
        Stack<Character> characters = new Stack<>();
        for (char bracket : exp.toCharArray()){
            if(bracket == '[' || bracket == '{' || bracket == '('){
                characters.push(bracket);
            } else if (characters.isEmpty()) { // empty and isEmpty is Same
                return false;
            } else if(bracket == ']' && characters.peek() == '['){
                characters.pop();
            }
            else if(bracket == ')' && characters.peek() == '('){
                characters.pop();
            }
            else if(bracket == '}' && characters.peek() == '{'){
                characters.pop();
            }
            else{
                System.out.println(bracket + " eta ");
                return false;
            }
        }
        return characters.empty();
    }
}
