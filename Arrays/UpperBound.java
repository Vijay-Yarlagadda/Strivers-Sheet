import java.util.*;

public class UpperBound {
    public static int upperBound(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (x < nums[i]) {
                return i;
            }
        }
        return -1;
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
