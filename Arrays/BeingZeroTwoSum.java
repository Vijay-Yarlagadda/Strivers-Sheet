import java.util.*;
import java.io.*;

class BeingZeroTwoSum {

    public int[] solve(int[] a, int n, int k) {

        long[] prefix = new long[n + 1];
        int j;

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + a[i];
        }

        for (int i = 0; i <= n; i++) {
            if (k <= prefix[i]) {
                j = i - 1;
                int temp = j;
                int count = 0;

                while (j >= 0) {
                    k -= a[j];
                    count++;

                    if (k == 0 && count == 2) {
                        return new int[] { j, temp };
                    }

                    if (k < 0 && count == 2) {
                        k += a[j];
                        count++;
                    }

                    j--;
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine().trim());

            int[] a = new int[n];

            String[] parts = br.readLine().trim().split(" ");

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(parts[i]);
            }

            int k = Integer.parseInt(br.readLine().trim());

            BeingZeroTwoSum obj = new BeingZeroTwoSum();

            int[] ans = obj.solve(a, n, k);

            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
