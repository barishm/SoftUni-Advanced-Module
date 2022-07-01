package advanced.t2_MultidimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        for (int row = 0; row < size; row++) {
            String[] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);
            }
        }

        int mainDiagonalSum = 0;
        for (int counter = 0; counter < size; counter++) {
            mainDiagonalSum += matrix[counter][counter];
        }

        int secondDiagonalSum = 0;

        for (int row = 0; row < size; row++) {
            secondDiagonalSum +=matrix[row][size - row - 1];
        }

        int result = Math.abs(mainDiagonalSum - secondDiagonalSum);
        System.out.println(result);
    }
}
