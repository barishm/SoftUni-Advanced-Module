package ExamExercises;

import java.util.*;

public class p1_ChocoTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Map<String, Integer> chocolates = new TreeMap<>();

        double[] milkArr = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(e -> Double.parseDouble(e)).toArray();
        double[] cacaoArr = Arrays.stream(scan.nextLine().split(" ")).mapToDouble(e -> Double.parseDouble(e)).toArray();

        ArrayDeque<Double> milkQueue = new ArrayDeque<>();
        for (Double s:milkArr) {
            milkQueue.offer(s);
        }
        ArrayDeque<Double> cacaoStack = new ArrayDeque<>();
        for (Double s :cacaoArr) {
            cacaoStack.push(s);
        }
        while(!cacaoStack.isEmpty()&&!milkQueue.isEmpty()){
            double cacaoValue = cacaoStack.poll();
            double milkValue = milkQueue.pop();
            if(cacaoValue / (milkValue + cacaoValue) == 0.3){
                String milk = "Milk Chocolate";
                chocolates.putIfAbsent(milk, 0);
                chocolates.put(milk, chocolates.get(milk) + 1);

            }else if(cacaoValue / (milkValue + cacaoValue) == 0.5){
                String dark = "Dark Chocolate";
                chocolates.putIfAbsent(dark, 0);
                chocolates.put(dark, chocolates.get(dark) + 1);


            }else if(cacaoValue / (milkValue + cacaoValue) == 1){
                String baking = "Baking Chocolate";
                chocolates.putIfAbsent(baking, 0);
                chocolates.put(baking, chocolates.get(baking) + 1);

            }else{
                milkValue += 10;
                milkQueue.offer(milkValue);
            }
        }
        if(chocolates.containsKey("Milk Chocolate")&&chocolates.containsKey("Dark Chocolate")&&chocolates.containsKey("Baking Chocolate")){
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        }else{
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        chocolates.forEach((key, value) -> System.out.println("# "+key + " --> " + value));
    }
}
