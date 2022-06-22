package t9_IteratorsAndComparators.ListyIterator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        ListyIterator listyIterator = null;
        while(!line.equals("END")){
            String[] commands = line.split(" ");
            switch (commands[0]){
                case "Create":
                    if(commands.length > 1) {
                        listyIterator = new ListyIterator(Arrays.copyOfRange(commands, 1, commands.length));
                    }else{
                        listyIterator = new ListyIterator();
                    }
                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    try{
                        listyIterator.print();
                    }catch (IllegalStateException e){
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "HasNext":
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    for (String s : listyIterator) {
                        System.out.print(s+" ");
                    }
                    System.out.println();
                    break;
            }
            line = scan.nextLine();
        }


    }
}
