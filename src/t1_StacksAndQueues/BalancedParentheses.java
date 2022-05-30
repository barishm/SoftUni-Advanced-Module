package t1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean YES = true;

        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();
        String expression = scan.nextLine();
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if(ch == '{' | ch == '(' | ch == '['){
                left.push(ch);
            }else if(ch == '}' | ch == ')' | ch == ']'){
                right.push(ch);
            }
        }
        for (int i = 0; i < left.size(); i++) {
            if(left.pop() == right.pop()){

            }

        }
    }
}
