import java.util.*;

class Pattern22 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();
        int i, j;
        System.out.println("The pattern is:");
        for (i = 0; i < 2 * n - 1; i++) {
            for (j = 0; j < 2 * n - 1; j++) {
                int top = i, down = j, right = (2 * n - 2) - j, left = (2 * n - 2) - i;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
            }
            System.out.println();
        }
    }
}