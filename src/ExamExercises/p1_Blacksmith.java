package ExamExercises;

import java.util.*;
import java.util.stream.Collectors;

public class p1_Blacksmith {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] steelArr = scan.nextLine().split(" ");
        String[] carbonArr = scan.nextLine().split(" ");

        List<Integer> steels = Arrays.stream(steelArr).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> carbons = Arrays.stream(carbonArr).map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<Integer> steelQueue = new ArrayDeque<>();
        for (Integer s:steels) {
            steelQueue.offer(s);
        }
        ArrayDeque<Integer> carbonStack = new ArrayDeque<>();
        for (Integer s : carbons) {
            carbonStack.push(s);
        }
        int gladius = 0;
        int shamshir = 0;
        int katana = 0;
        int sabre = 0;
        while (!steelQueue.isEmpty()&&!carbonStack.isEmpty()){
            int steel = steelQueue.poll();
            int carbon = carbonStack.pop();

            int sum = steel+carbon;
            if(sum == 70){
                gladius++;
            }else if(sum == 80){
                shamshir++;
            }else if(sum == 90){
                katana++;
            }else if(sum == 110){
                sabre++;
            }else{
                carbon += 5;
                carbonStack.push(carbon);
            }
        }
        if(gladius+shamshir+katana+sabre==0){
            System.out.println("You did not have enough resources to forge a sword.");
        }else{
            System.out.printf("You have forged %d swords.%n",gladius+shamshir+katana+sabre);
        }
        if(steelQueue.isEmpty()){
            System.out.println("Steel left: none");
        }else{
            System.out.print("Steel left: ");
            while(!steelQueue.isEmpty()){
                System.out.print(steelQueue.poll());
                if(!steelQueue.isEmpty()){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        if(carbonStack.isEmpty()){
            System.out.println("Carbon left: none");
        }else{
            System.out.print("Carbon left: ");
            while(!carbonStack.isEmpty()){
                System.out.print(carbonStack.pop());
                if(!carbonStack.isEmpty()){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        if(gladius>0){
            System.out.println("Gladius: "+gladius);
        }
        if(katana>0){
            System.out.println("Katana: "+katana);
        }
        if(sabre>0){
            System.out.println("Sabre: "+sabre);
        }
        if(shamshir>0){
            System.out.println("Shamshir: "+shamshir);
        }

    }
}
