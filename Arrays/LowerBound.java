import java.util.*;

class LowerBound {
    public static int lowerBoundRec(int[] arr, int low, int high, int x, int ans) {
        if (low > high)
            return ans;
        int mid = (low + high) / 2;
        if (arr[mid] >= x) {
            return lowerBoundRec(arr, low, mid - 1, x, mid);
        } else {
            return lowerBoundRec(arr, mid + 1, high, x, ans);
        }
    }

    public static int lowerBound(int[] arr, int x) {
        return lowerBoundRec(arr, 0, arr.length - 1, x, arr.length);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target value:");
        int target = sc.nextInt();
        int res = lowerBound(a, target);
        System.out.println("Index " + res + " is the smallest index");
        sc.close();
    }
}