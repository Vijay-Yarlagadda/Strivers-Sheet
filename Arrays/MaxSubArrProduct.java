import java.util.*;

class MaxSubArrProduct {
    public static int maxProduct(int[] nums) {
        int pref = 1, suff = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (pref == 0)
                pref = 1;
            if (suff == 0)
                suff = 1;
            pref *= nums[i];
            suff *= nums[nums.length - i - 1];
            max = Math.max(max, Math.max(pref, suff));
        }
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = maxProduct(arr);
        System.out.println("The result is: " + res);
        sc.close();
    }
}