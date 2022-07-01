package advanced.t1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] commands = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(commands[0]);
        int s = Integer.parseInt(commands[1]);
        int x = Integer.parseInt(commands[2]);
        int smallest = Integer.MAX_VALUE;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            stack.push(scan.nextInt());
        }
        for (int i = 0; i < s; i++) {
            stack.pop();
        }
        if(stack.contains(x)){
            System.out.println("true");
            return;
        }
        if(stack.isEmpty()){
            System.out.println(0);
            return;
        }
        for (int i = 0; i < stack.size(); i++) {
            if(smallest > stack.peek()){
                smallest = stack.pop();
            }else{
                stack.pop();
            }
        }
        System.out.println(smallest);
    }
}
