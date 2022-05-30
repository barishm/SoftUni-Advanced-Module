package t1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer>stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] commands = scan.nextLine().split("\\s+");
            switch (commands[0]){
                case "1":
                    stack.push(Integer.parseInt(commands[1]));
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}
