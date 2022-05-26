package t1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayDeque<Integer>stack = new ArrayDeque<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String[] commands = scan.nextLine().split("\\s+");
            switch (commands[0]){
                case "1":
                    stack.push(Integer.parseInt(commands[1]));
                    break;
                case "2":
                    stack.pop();
                case "3":
                    int m = 0;
                    for (int j = 0; j < stack.size(); j++) {
                        m = stack.pop();
                        if(m > max){
                            max = m;
                        }


                    }
                    System.out.println(max);
                    break;
            }
        }
        System.out.println(max);
    }
}
