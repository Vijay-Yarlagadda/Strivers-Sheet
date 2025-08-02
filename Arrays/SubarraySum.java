import java.util.*;

class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        int i = 0, j = 0, sum = 0, count = 0;
        while (i < nums.length) {
            sum += nums[i];
            if (sum == k) {
                count++;
            }
            if (i == nums.length - 1) {
                sum = 0;
                j++;
                i = j - 1;
            }
            i++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target sum: ");
        int k = sc.nextInt();
        SubarraySum ss = new SubarraySum();
        int target = ss.subarraySum(a, k);
        System.out.println("No of sub arrays are: " + target);
        sc.close();
    }
}
