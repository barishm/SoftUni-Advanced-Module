package advanced.t2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] dimensions = scan.nextLine().split("\\s+");

        int firstMatrixRows = Integer.parseInt(dimensions[0]);
        int firstMatrixCols  = Integer.parseInt(dimensions[1]);

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];

        for (int i = 0; i < firstMatrixRows; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            firstMatrix[i] = arr;
        }

        dimensions = scan.nextLine().split("\\s+");

        int secondMatrixRows = Integer.parseInt(dimensions[0]);
        int secondMatrixCols = Integer.parseInt(dimensions[1]);
        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];

        for (int i = 0; i < secondMatrixRows; i++) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            secondMatrix[i] = arr;
        }
        boolean equal = matricesAreEqual(firstMatrix,secondMatrix);
        if(equal){
            System.out.println("equal");

        }else{
            System.out.println("not equal");
        }
    }
    private static boolean matricesAreEqual(int[][] firstMatrix,int[][]secondMatrix){
        if(firstMatrix.length != secondMatrix.length){
            return false;
        }
        for (int row = 0; row  < firstMatrix.length; row++) {
            if(firstMatrix[row].length != secondMatrix[row].length){
                return false;
            }
            for (int cols = 0; cols < firstMatrix[row].length; cols++) {
                if(firstMatrix[row][cols]!=secondMatrix[row][cols]){
                    return false;
                }
            }
            
        }
        return true;
    }
}
