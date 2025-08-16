import java.util.*;

public class PascalTriangle3 {
    public int ncr(int r, int c) {
        long res = 1;
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    public List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for (int row = 1; row <= n; row++) {
            List<Integer> temp = new ArrayList<>();
            for (int col = 1; col <= row; col++) {
                temp.add(ncr(row - 1, col - 1));
            }
            list.add(temp);
        }
        return list;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no fo rows: ");
        int n = sc.nextInt();
        PascalTriangle3 ps = new PascalTriangle3();
        List<List<Integer>> ans = ps.pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
