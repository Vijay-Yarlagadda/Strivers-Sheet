import java.util.*;

class Pattern8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no of rows:");
        n = sc.nextInt();
        int i, j;
        System.out.println("The pattern is:");
        for (i = 0; i < n; i++) {
            // spaces
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // stars
            for (j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }

            // spaces
            for (j = 0; j < i; j++) {
                System.out.print("");
            }
            System.out.println();
        }
    }
}