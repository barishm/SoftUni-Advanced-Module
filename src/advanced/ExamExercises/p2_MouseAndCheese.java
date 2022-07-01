package advanced.ExamExercises;

import java.util.Scanner;

public class p2_MouseAndCheese {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        char[][] matrix = new char[n][n];

        int[] mouse = new int[2];

        int cheese = 0;

        for (int i = 0; i < n; i++) {
            matrix[i] = scan.nextLine().toCharArray();
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'M') {
                    mouse[0] = row;
                    mouse[1] = col;
                }
            }
        }
        String input = scan.nextLine();
        while (!input.equals("end")) {

            switch (input) {
                case "up":
                    matrix[mouse[0]][mouse[1]] = '-';
                    mouse[0] -= 1;
                    break;
                case "down":
                    matrix[mouse[0]][mouse[1]] = '-';
                    mouse[0] += 1;
                    break;
                case "left":
                    matrix[mouse[0]][mouse[1]] = '-';
                    mouse[1] -= 1;
                    break;
                case "right":
                    matrix[mouse[0]][mouse[1]] = '-';
                    mouse[1] += 1;
                    break;
            }
            if (mouse[0] < 0 || mouse[0] > n - 1 || mouse[1] < 0 || mouse[1] > n - 1) {
                System.out.println("Where is the mouse?");
                break;
            }
            if(matrix[mouse[0]][mouse[1]] == 'c'){
                cheese++;
            }
            if(matrix[mouse[0]][mouse[1]] == 'B'){
                continue;
            }
            matrix[mouse[0]][mouse[1]] = 'M';

            input = scan.nextLine();
        }
        if(cheese < 5){
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n",5-cheese);
        }else {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n",cheese);
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
