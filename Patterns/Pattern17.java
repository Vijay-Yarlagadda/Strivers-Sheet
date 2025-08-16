import java.util.*;

class Pattern17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int n = sc.nextInt();
        int i, j;
        System.out.println("Pattern is:");
        for (i = 0; i < n; i++) {
            // spaces
            for (j = 0; j < n - 1 - i; j++) {
                System.out.print(" " + " ");
            }
            // letters
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch + " ");
                if (j <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }
            // spaces
            for (j = 0; j < n - 1 - i; j++) {
                System.out.print(" " + " ");
            }
            System.out.println();
            sc.close();
        }
    }
}