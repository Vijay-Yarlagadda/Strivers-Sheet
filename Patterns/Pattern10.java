import java.util.*;

class Pattern10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no of rows:");
        n = sc.nextInt();
        int i, j;
        System.out.println("The pattern is:");
        for (i = 0; i < n; i++) {
            // stars
            for (j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            // spaces
            for (j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (i = 0; i < n - 1; i++) {
            // star
            for (j = 0; j < n - 1 - i; j++) {
                System.out.print("*");
            }
            // spaces
            for (j = i + 1; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}