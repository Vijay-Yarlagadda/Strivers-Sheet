import java.util.*;

class Pattern14 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();
        int i;
        char ch;
        System.out.println("The pattern is:");
        for (i = 1; i <= n; i++) {
            for (ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}