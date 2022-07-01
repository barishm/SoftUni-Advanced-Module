package advanced.ExamExercises;

import java.util.Scanner;

public class p2_ArmoryV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        char[][] armory = new char[n][n];
        int[] officerXY = new int[]{-10,-10};
        int price = 0;
        int[] mirror1 = new int[]{-10,-10};
        int[] mirror2 = new int[]{-10,-10};

        for (int i = 0; i < n; i++) {
            armory [i] = scan.nextLine().toCharArray();
        }
        for (int row = 0; row < armory.length; row++) {
            for (int col = 0; col < armory[row].length; col++) {
                if (armory[row][col] == 'A') {
                    officerXY [0] = row;
                    officerXY [1] = col;
                } else if (armory[row][col] == 'M') {
                    if (mirror1[0] == -10) {
                        mirror1[0] = row;
                        mirror1[1] = col;
                    } else {
                        mirror2[0] = row;
                        mirror2[1] = col;
                    }
                }
            }
        }
        while (true) {
            String input = scan.nextLine();
            switch (input) {
                case "up":
                    armory[officerXY[0]][officerXY[1]] = '-';
                    officerXY[0] -= 1;
                    break;
                case "down":
                    armory[officerXY[0]][officerXY[1]] = '-';
                    officerXY[0] += 1;
                    break;
                case "left":
                    armory[officerXY[0]][officerXY[1]] = '-';
                    officerXY[1] -= 1;
                    break;
                case "right":
                    armory[officerXY[0]][officerXY[1]] = '-';
                    officerXY[1] += 1;
                    break;
            }
            if (officerXY[0] < 0 || officerXY[0] > n-1 || officerXY[1] < 0 || officerXY[1] > n-1) {
                System.out.println("I do not need more swords!");
                break;
            }
            if (armory[officerXY[0]][officerXY[1]] > 47 && armory[officerXY[0]][officerXY[1]] < 58) {
                price += Integer.parseInt(String.valueOf(armory[officerXY[0]][officerXY[1]]));
                armory[officerXY[0]][officerXY[1]] = '-';
            }
            if (armory[officerXY[0]][officerXY[1]] == 'M') {
                if (officerXY[0] == mirror1[0] && officerXY[1] == mirror1[1]) {
                    armory[officerXY[0]][officerXY[1]] = '-';
                    officerXY[0] = mirror2[0];
                    officerXY[1] = mirror2[1];
                } else if (officerXY[0] == mirror2[0] && officerXY[1] == mirror2[1]) {
                    armory[officerXY[0]][officerXY[1]] = '-';
                    officerXY[0] = mirror1[0];
                    officerXY[1] = mirror1[1];
                }

            }
            armory[officerXY[0]][officerXY[1]] = 'A';
            if(price >= 65){
                System.out.println("Very nice swords, I will come back for more!");
                break;
            }
        }
        System.out.printf("The king paid %d gold coins.%n",price);
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(armory[row][col]);
            }
            System.out.println();
        }
    }
}
