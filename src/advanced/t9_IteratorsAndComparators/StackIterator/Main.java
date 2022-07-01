package advanced.t9_IteratorsAndComparators.StackIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Stack stack = new Stack();

        while (!input.equals("END")) {
            String[] commands = input.split("\\s+|,\\s+");
            switch (commands[0]) {
                case "Pop":
                    try {
                        stack.pop();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "Push":
                    stack.push(Arrays.copyOfRange(commands, 1, commands.length));
                    break;
            }

            input = scan.nextLine();
        }

        Stack.print(stack);
        Stack.print(stack);
    }

}
