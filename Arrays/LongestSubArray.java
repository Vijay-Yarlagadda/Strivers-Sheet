import java.util.*;

class LongestSubArray {
    public int longestSubarray(int[] nums, int k) {
        int j = 0, count = 0, temp = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                sum = 0;
                count = 0;
                i = j++;
            }
            if (nums[i] >= 0) {
                sum += nums[i];
                count++;
                if (sum == k && count > temp) {
                    temp = count;
                    i = j++;
                    sum = 0;
                    count = 0;
                }
            }
        }
        return temp;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter sum target: ");
        int k = sc.nextInt();
        LongestSubArray la = new LongestSubArray();
        int result = la.longestSubarray(a, k);
        System.out.println("Result: " + result);
        sc.close();
    }
}