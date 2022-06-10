package t6_DefiningClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfPeople = Integer.parseInt(scan.nextLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < countOfPeople; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name,age);
            people.add(person);
        }
        people.stream()
                .filter(person -> person.getAge() > 30)
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);


    }
}
