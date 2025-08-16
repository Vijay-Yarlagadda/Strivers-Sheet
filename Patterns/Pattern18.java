import java.util.*;

class Pattern18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();
        int i, j;
        System.out.println("Pattern is:");
        sc.close();
        for (i = 0; i < n; i++) {
            // alphabets
            char start = (char) ('A' + n - 1);
            for (j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start--;
            }
            System.out.println();
        }

    }
}