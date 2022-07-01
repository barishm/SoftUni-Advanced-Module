package advanced.t2_MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] dimensions = scan.nextLine().split("\\s+");

        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        int[][] matrix = new int[rows][cols];
        List<String> indexes = new ArrayList<>();

        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
        int number = Integer.parseInt(scan.nextLine());
        for (int row = 0; row <= rows - 1; row++) {
            for (int col = 0; col <= cols - 1; col++) {
                if (number == matrix[row][col]) {
                    indexes.add(row + " " + col);
                }
            }
        }
        if (!indexes.isEmpty()) {
            for (String index : indexes) {
                System.out.println(index);
            }
        }else{
            System.out.println("not found");
        }
    }
}
