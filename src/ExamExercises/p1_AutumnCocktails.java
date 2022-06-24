package ExamExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p1_AutumnCocktails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pearSoul = 0;
        int theHarvest = 0;
        int appleHinny = 0;
        int highFashion = 0;
        int sumOfIngr = 0;

        int[] ingrArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] freshnessArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        ArrayDeque<Integer> ingrQueue = new ArrayDeque<>();
        for (Integer s:ingrArr) {
            ingrQueue.offer(s);
        }
        ArrayDeque<Integer> freshnessStack = new ArrayDeque<>();
        for (Integer s :freshnessArr) {
            freshnessStack.push(s);
        }
        while (!ingrQueue.isEmpty()&&!freshnessStack.isEmpty()){
            int ingr = ingrQueue.poll();
            if(ingr == 0){
                continue;
            }
            int fresh = freshnessStack.poll();

            if(fresh * ingr == 150){
                pearSoul++;
            }else if(fresh*ingr == 250){
                theHarvest++;
            }else if(fresh*ingr == 300){
                appleHinny++;
            }else if(fresh*ingr == 400){
                highFashion++;
            }else {
                ingr += 5;
                ingrQueue.offer(ingr);
            }
        }
        if(pearSoul > 0 && theHarvest > 0 && appleHinny > 0 && highFashion > 0){
            System.out.println("It's party time! The cocktails are ready!");
        }else{
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }
        if(!ingrQueue.isEmpty()){
            while (!ingrQueue.isEmpty()){
                sumOfIngr += ingrQueue.poll();
            }
            System.out.println("Ingredients left: "+sumOfIngr);
        }
        if(appleHinny > 0){
            System.out.println("# Apple Hinny --> "+appleHinny);
        }
        if(highFashion > 0){
            System.out.println("# High Fashion --> "+highFashion);
        }
        if(pearSoul > 0){
            System.out.println("# Pear Sour --> "+pearSoul);
        }
        if(theHarvest > 0){
            System.out.println("# The Harvest --> "+theHarvest);
        }
    }
}
