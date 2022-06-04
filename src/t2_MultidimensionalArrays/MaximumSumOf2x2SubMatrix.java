package t2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dimensions = scan.nextLine().split(", ");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int[][] matrix = new int[rows][cols];
        int[][] subMatrix = new int[2][2];
        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scan.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
        for (int row = 0; row < rows-1; row++) {
            int curSum = 0;
            for (int col = 0; col < cols-1; col++) {
                curSum += matrix[row][col]+
                        matrix[row+1][col]+
                        matrix[row][col+1]+
                        matrix[row+1][col+1];
                if(curSum > maxSum){
                    maxSum = curSum;
                    subMatrix[0][0] = matrix[row][col];
                    subMatrix[0][1] = matrix[row][col+1];
                    subMatrix[1][0] = matrix[row+1][col];
                    subMatrix[1][1] = matrix[row+1][col+1];
                }
                curSum = 0;
            }

        }
        System.out.println(subMatrix[0][0]+" "+subMatrix[0][1]);
        System.out.println(subMatrix[1][0]+" "+subMatrix[1][1]);
        System.out.println(maxSum);
    }
}
