package advanced.t1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isBalanced = true;

        Deque<Character> openedBracket = new ArrayDeque<>();

        String expression = scan.nextLine();
        for (int i = 0; i < expression.length(); i++) {
            char currentBracket = expression.charAt(i);
            if (currentBracket == '{' || currentBracket == '(' || currentBracket == '[') {
                openedBracket.push(currentBracket);
            } else {
                if (openedBracket.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char lastBracket = openedBracket.pop();
                if (currentBracket == '}' && lastBracket != '{') {
                    isBalanced = false;
                } else if (currentBracket == ')' && lastBracket != '(') {
                    isBalanced = false;
                } else if (currentBracket == ']' && lastBracket != '[') {
                    isBalanced = false;
                }
            }
        }

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
