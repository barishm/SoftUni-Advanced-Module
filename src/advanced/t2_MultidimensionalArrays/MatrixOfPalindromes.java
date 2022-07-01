package advanced.t2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes    {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] nxn = Arrays
                .stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = nxn[0];
        int cols = nxn[1];
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char outside = (char) ('a' + row);
                char middle = (char) (outside + col);
                matrix[row][col] = String.valueOf(outside) + middle + outside;
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

}
