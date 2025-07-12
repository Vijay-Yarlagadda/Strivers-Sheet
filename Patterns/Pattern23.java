import java.util.*;

class Pattern23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int i, j;
        System.out.println("Pattern 23:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == n - 1 || j == 0 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
