package advanced.t1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberWithStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] line = scan.nextLine().split("\\s+");
        for (String s : line) {
            stack.push(s);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
