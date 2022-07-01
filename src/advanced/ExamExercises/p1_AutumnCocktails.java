package advanced.ExamExercises;

import java.util.*;

public class p1_AutumnCocktails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sumOfIngr = 0;

        Map<String, Integer> cocktails = new TreeMap<>();

        int[] ingrArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] freshnessArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        ArrayDeque<Integer> ingrQueue = new ArrayDeque<>();
        for (Integer s : ingrArr) {
            ingrQueue.offer(s);
        }
        ArrayDeque<Integer> freshnessStack = new ArrayDeque<>();
        for (Integer s : freshnessArr) {
            freshnessStack.push(s);
        }
        while (!ingrQueue.isEmpty() && !freshnessStack.isEmpty()) {
            int ingr = ingrQueue.poll();
            if (ingr == 0) {
                continue;
            }
            int fresh = freshnessStack.poll();

            if (fresh * ingr == 150) {
                String pearSoul = "Pear Sour";
                cocktails.putIfAbsent(pearSoul, 0);
                cocktails.put(pearSoul, cocktails.get(pearSoul) + 1);
            } else if (fresh * ingr == 250) {
                String theHarvest = "The Harvest";
                cocktails.putIfAbsent(theHarvest, 0);
                cocktails.put(theHarvest, cocktails.get(theHarvest) + 1);
            } else if (fresh * ingr == 300) {
                String appleHinny = "Apple Hinny";
                cocktails.putIfAbsent(appleHinny, 0);
                cocktails.put(appleHinny, cocktails.get(appleHinny) + 1);
            } else if (fresh * ingr == 400) {
                String highFashion = "High Fashion";
                cocktails.putIfAbsent(highFashion, 0);
                cocktails.put(highFashion, cocktails.get(highFashion) + 1);
            } else {
                ingr += 5;
                ingrQueue.offer(ingr);
            }
        }
        if (cocktails.containsKey("Pear Sour") && cocktails.containsKey("The Harvest")
                && cocktails.containsKey("Apple Hinny") && cocktails.containsKey("High Fashion")) {
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }
        if (!ingrQueue.isEmpty()) {
            while (!ingrQueue.isEmpty()) {
                sumOfIngr += ingrQueue.poll();
            }
            System.out.println("Ingredients left: " + sumOfIngr);
        }
        cocktails.forEach((key, value) -> System.out.println("# " + key + " --> " + value));
    }
}
