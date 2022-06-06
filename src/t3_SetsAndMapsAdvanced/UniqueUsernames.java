package t3_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;


public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfUsernames = Integer.parseInt(scanner.nextLine());

        LinkedHashSet<String> usernames = new LinkedHashSet<>();
        for (int i = 0; i < numberOfUsernames; i++) {
            String input = scanner.nextLine();
            usernames.add(input);
        }

        usernames.forEach(System.out::println);

    }
}
