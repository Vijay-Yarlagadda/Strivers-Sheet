import java.util.*;

class Pattern15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();
        int i;
        System.out.println("The pattern is:");
        char ch;
        for (i = 0; i < n; i++) {
            for (ch = 'A'; ch <= 'A' + (n - 1 - i); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}