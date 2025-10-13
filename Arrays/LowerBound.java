import java.util.*;

class LowerBound {
    public static int lowerBound(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > x || nums[i] == x) {
                return i;
            }
        }
        return -1;
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