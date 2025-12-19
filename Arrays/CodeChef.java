import java.util.*;

class CodeChef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n <= 2) {
                int a[] = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                System.out.println("0");
                continue;
            }
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long dif = Long.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                dif = Math.min(dif, (a[i + 1] - a[i]));
            }
            int res = 0;
            for (int i = 0; i < n - 1; i++) {
                if ((a[i + 1] - a[i]) > dif) {
                    res += (int) (Math.ceil((double) (a[i + 1] - a[i]) / dif) - 1);
                }
            }
            System.out.println(res);
        }
        sc.close();
    }
}
