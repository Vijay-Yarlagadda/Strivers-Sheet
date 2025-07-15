import java.util.*;

public class rotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int i, j;
        int[] a = new int[nums.length];
        j = 0;
        for (i = nums.length - k; i < nums.length; i++) {
            a[j] = nums[i];
            j++;
        }
        j = k;
        for (i = k; i < nums.length; i++) {
            a[i] = nums[i - j];
        }
        for (i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
        for (i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k (rotation count): ");
        int k = sc.nextInt();
        rotateArray r = new rotateArray();
        r.rotate(arr, k);
    }
}
