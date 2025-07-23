import java.util.*;

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE, start = -1, end = -1, tempstart = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
                start = tempstart;
                end = i;
            }
            if (sum < 0)
                sum = 0;
            tempstart = i;
        }
        System.out.print("Subarray with max sum: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        MaxSubArray obj = new MaxSubArray();
        System.out.println("MAX SUB ARR SUM: " + obj.maxSubArray(nums));
    }
}
