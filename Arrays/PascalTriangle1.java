import java.util.*;

public class PascalTriangle1 {
    public int ncr(int r, int c) {
        long res = 1;
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number: ");
        int r = sc.nextInt();
        System.out.println("Enter column number: ");
        int c = sc.nextInt();
        PascalTriangle1 ps = new PascalTriangle1();
        int element = ps.ncr(r - 1, c - 1);
        System.out.println("Result Element is: " + element);
        sc.close();
    }
}
