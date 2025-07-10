import java.util.*;

class Pattern21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no of rows:");
        n = sc.nextInt();
        int i, j;
        System.out.println("The pattern is:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}