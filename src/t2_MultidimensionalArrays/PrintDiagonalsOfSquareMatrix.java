package t2_MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nxn = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[nxn][nxn];

        for (int row = 0; row < nxn; row++) {
            int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[row] = arr;
        }
        for (int i = 0; i < nxn; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int i = 0, k = nxn-1; i < nxn; i++, k--) {
            System.out.print(matrix[k][i] + " ");
        }
    }
}
