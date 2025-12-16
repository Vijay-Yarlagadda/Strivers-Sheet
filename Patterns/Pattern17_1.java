import java.util.*;

class Pattern17_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();
        int i, j;
        char ch;
        System.out.println("Pattern is:");
        for (i = 1; i <= n; i++) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }
            char c = (char) ('A' + (i - 2));
            for (j = 0; j < i - 1; j++) {
                System.out.print(c);
                c--;
            }
            for (j = 0; j < n - 1 - i; j++) {
                System.out.print(" " + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}