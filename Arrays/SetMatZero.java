import java.util.*;

public class SetMatZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int colm = sc.nextInt();

        int[][] matrix = new int[row][colm];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        setZeroes(matrix);

        System.out.println("Matrix after setting zeroes:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int colm = matrix[0].length;
        int[] rowmat = new int[row];
        int[] colmmat = new int[colm];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                if (matrix[i][j] == 0) {
                    rowmat[i] = 1;
                    colmmat[j] = 1;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                if (rowmat[i] == 1 || colmmat[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
