package t1_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] commands = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(commands[0]);
        int s = Integer.parseInt(commands[1]);
        int x = Integer.parseInt(commands[2]);
        int smallest = Integer.MAX_VALUE;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            queue.offer(scan.nextInt());
        }
        for (int i = 0; i < s; i++) {
            queue.poll();
        }
        if(queue.contains(x)){
            System.out.println("true");
        }
        else if(queue.isEmpty()){
            System.out.println(0);
        }else {
            for (Integer integer : queue) {
                if(integer < smallest){
                smallest = integer;
                }
            }
            System.out.println(smallest);
        }
    }
}
