package advanced.ExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2_Armory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int matrixSize = Integer.parseInt(scan.nextLine());
        char[][] matrix = new char[matrixSize][matrixSize];

        int[] officerXY = new int[2];
        int[] mirror1 = new int[2];
        int[] mirror2 = new int[2];
        boolean firstMirrorFound = false;
        int price = 0;


        for (int row = 0; row < matrixSize; row++) {
            List<Character> characterList = Arrays.stream(scan.nextLine().split(""))
                    .map(e -> e.charAt(0))
                    .collect(Collectors.toList());


            for (int col = 0; col < characterList.size(); col++) {
                char currentChar = characterList.get(col);
                if (currentChar == 'A') {
                    officerXY[0] = row;
                    officerXY[1] = col;
                }
                if (currentChar == 'M') {
                    if (!firstMirrorFound) {
                        mirror1[0] = row;
                        mirror1[1] = col;
                        firstMirrorFound = true;
                    } else {
                        mirror2[0] = row;
                        mirror2[1] = col;
                    }
                }
                matrix[row][col] = currentChar;
            }
        }
        while (true) {
            String input = scan.nextLine();
            switch (input) {
                case "up":
                    matrix[officerXY[0]][officerXY[1]] = '-';
                    officerXY[0] -= 1;
                    break;
                case "down":
                    matrix[officerXY[0]][officerXY[1]] = '-';
                    officerXY[0] += 1;
                    break;
                case "left":
                    matrix[officerXY[0]][officerXY[1]] = '-';
                    officerXY[1] -= 1;
                    break;
                case "right":
                    matrix[officerXY[0]][officerXY[1]] = '-';
                    officerXY[1] += 1;
                    break;
            }
            if (officerXY[0] < 0 || officerXY[0] > matrixSize-1 || officerXY[1] < 0 || officerXY[1] > matrixSize-1) {
                System.out.println("I do not need more swords!");
                break;
            }
            if (matrix[officerXY[0]][officerXY[1]] > 47 && matrix[officerXY[0]][officerXY[1]] < 58) {
                price += Integer.parseInt(String.valueOf(matrix[officerXY[0]][officerXY[1]]));
                matrix[officerXY[0]][officerXY[1]] = '-';
            }
            if (matrix[officerXY[0]][officerXY[1]] == 'M') {
                if (officerXY[0] == mirror1[0] && officerXY[1] == mirror1[1]) {
                    matrix[officerXY[0]][officerXY[1]] = '-';
                    officerXY[0] = mirror2[0];
                    officerXY[1] = mirror2[1];
                } else if (officerXY[0] == mirror2[0] && officerXY[1] == mirror2[1]) {
                    matrix[officerXY[0]][officerXY[1]] = '-';
                    officerXY[0] = mirror1[0];
                    officerXY[1] = mirror1[1];
                }

            }
            matrix[officerXY[0]][officerXY[1]] = 'A';
            if(price >= 65){
                System.out.println("Very nice swords, I will come back for more!");
                break;
            }
        }
        System.out.printf("The king paid %d gold coins.%n",price);
        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
