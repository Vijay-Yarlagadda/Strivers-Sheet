import java.util.*;

public class UpperBound {
    public static int upperBoundRec(int[] arr, int low, int high, int x, int ans) {
        if (low > high)
            return ans;
        int mid = (low + high) / 2;
        if (arr[mid] > x) {
            return upperBoundRec(arr, low, mid - 1, x, mid);
        } else {
            return upperBoundRec(arr, mid + 1, high, x, ans);
        }
    }

    public static int upperBound(int[] arr, int x) {
        return upperBoundRec(arr, 0, arr.length - 1, x, arr.length);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target value: ");
        int target = sc.nextInt();
        int res = upperBound(a, target);
        System.out.println("index " + res + " is the upper bound");
        sc.close();
    }
}
