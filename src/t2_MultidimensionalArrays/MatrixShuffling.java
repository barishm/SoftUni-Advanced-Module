package t2_MultidimensionalArrays;


import java.util.Arrays;
import java.util.Scanner;


public class MatrixShuffling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = matrixSize[0];
        int cols = matrixSize[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split(" ");

            matrix[row] = line;
        }

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] data = input.split("\\s+");
            String command = data[0];
            if(data.length != 5){
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }
            int row1 = Integer.parseInt(data[1]);
            int col1 = Integer.parseInt(data[2]);
            int row2 = Integer.parseInt(data[3]);
            int col2 = Integer.parseInt(data[4]);
            boolean isValid = isValid(rows, cols, row1, col1, row2, col2);
            if (command.equals("swap") && isValid) {
                String replacement = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = replacement;
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {
                        System.out.print(matrix[row][col]+" ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine();
        }
    }

    public static boolean isValid(int rows, int cols, int row1, int col1, int row2, int col2) {
        return rows >= row1 && rows >= row2 || cols >= col1 && cols >= col2;
    }
}
