package advanced.ExamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p2_StickyFingers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] commands = scan.nextLine().split(",");

        int pocket = 0;

        char[][] matrix = new char[n][n];

        int[] dillinger = new int[2];


        for (int row = 0; row < n; row++) {
            List<Character> characterList = Arrays.stream(scan.nextLine().split(" "))
                    .map(e -> e.charAt(0))
                    .collect(Collectors.toList());


            for (int col = 0; col < characterList.size(); col++) {
                char currentChar = characterList.get(col);
                if (currentChar == 'D') {
                    dillinger[0] = row;
                    dillinger[1] = col;
                }
                matrix[row][col] = currentChar;
            }
        }

        for (int i = 0; i < commands.length; i++) {

            switch (commands[i]){
                case "up":
                    if(dillinger[0]!=0){
                    matrix[dillinger[0]][dillinger[1]] = '+';
                    dillinger[0] -= 1;
                    }else{
                        cannotEscape();
                    }
                    break;
                case "down":
                    if(dillinger[0]!=n-1){
                    matrix[dillinger[0]][dillinger[1]] = '+';
                    dillinger[0] += 1;
                    }else{
                        cannotEscape();
                    }
                    break;
                case "right":
                    if(dillinger[1]!=n-1){
                    matrix[dillinger[0]][dillinger[1]] = '+';
                    dillinger[1] += 1;
                    }else{
                        cannotEscape();
                    }
                    break;
                case "left":
                    if(dillinger[1]!=0){
                    matrix[dillinger[0]][dillinger[1]] = '+';
                    dillinger[1] -= 1;
                    }else{
                        cannotEscape();
                    }
                    break;
            }
            if(matrix[dillinger[0]][dillinger[1]] == '$'){
                pocket += dillinger[0] * dillinger[1];
                System.out.printf("You successfully stole %d$.%n",dillinger[0] * dillinger[1]);
            }
            if(matrix[dillinger[0]][dillinger[1]] == 'P'){
                System.out.printf("You got caught with %d$, and you are going to jail.%n",pocket);
                matrix[dillinger[0]][dillinger[1]] = '#';
                return;
            }
            if(i == commands.length-1){
                System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n",pocket);
            }
            matrix[dillinger[0]][dillinger[1]] = 'D';


        }
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] chars : matrix) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(chars[col] + " ");
            }
            System.out.println();
        }
    }

    private static void cannotEscape() {
        System.out.println("You cannot leave the town, there is police outside!");
    }
}
