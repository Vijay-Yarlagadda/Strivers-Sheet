import java.util.*;

class Pattern16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Entr no of rows: ");
        n = sc.nextInt();
        System.out.println("pattern is:");
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((char) ('A' + i - 1) + " ");
            }
            System.out.println();
        }
    }
}