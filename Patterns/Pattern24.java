import java.util.*;

class Pattern24 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int even = 2, odd = 1, i, j;
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("The pattern is:");
        for (i = 1; i <= n; i++) {
            // spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // numbers
            if (i % 2 == 0) {
                for (j = 1; j <= i; j++) {
                    System.out.print(even + " ");
                    even += 2;
                }
                System.out.println();
            } else {
                for (j = 1; j <= i; j++) {
                    System.out.print(odd + " ");
                    odd += 2;
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
