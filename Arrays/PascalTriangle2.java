import java.util.*;

public class PascalTriangle2 {
    public int ncr(int r, int c) {
        long res = 1;
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public void pascalTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(ncr(n - 1, i - 1) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int n = sc.nextInt();
        PascalTriangle2 ps = new PascalTriangle2();
        ps.pascalTriangle(n);
        sc.close();
    }
}
