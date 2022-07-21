package oop.t4_InterfacesAndAbstraction.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        List<Identifiable> identifiableList = new ArrayList<>();

        while (!"End".equals(input)){
            String[] tokens = input.split(" ");
            Identifiable identifiable = null;
            if(tokens.length == 2){
                identifiable = new Robot(tokens[0],tokens[1]);
            }else if(tokens.length == 3){
                identifiable = new Citizen(tokens[0],Integer.parseInt(tokens[1]),tokens[2]);
            }

            identifiableList.add(identifiable);
            input = scan.nextLine();
        }
        String fakeIdPostfix = scan.nextLine();

        identifiableList
                .stream()
                .map(Identifiable::getId)
                .filter(i -> i.endsWith(fakeIdPostfix))
                .forEach(System.out::println);

    }
}
