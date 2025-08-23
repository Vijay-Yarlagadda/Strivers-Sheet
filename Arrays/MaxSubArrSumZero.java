import java.util.*;

public class MaxSubArrSumZero {
    public static int maxLen(int[] arr) {
        int sum = 0, count = 0;
        int start = 0, max = 0;
        for (int i = 0; start < arr.length; i++) {
            sum += arr[i];
            count++;
            if (sum == 0 && i != arr.length - 1) {
                max = Math.max(max, count);
                continue;
            }
            if (sum == 0 && i == arr.length - 1) {
                max = Math.max(max, count);
                count = 0;
                start++;
                i = start - 1;
            }
            if (i == arr.length - 1 && sum != 0) {
                start++;
                i = start - 1;
                sum = 0;
                count = 0;
            }
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter arrray length: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int result = maxLen(a);
        System.out.println("Max sub array sum zero is: " + result);
        sc.close();
    }
}
