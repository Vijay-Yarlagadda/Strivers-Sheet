import java.util.*;

public class SubArrWithXorK1 {
    public static int subarraysWithXorK(int[] nums, int k) {
        int count = 0, temp = 0;
        int j = 0;
        int res = 0;
        for (int i = j; i < nums.length; i++) {

            res ^= nums[i];

            // Your original check for single elements
            if (nums[i] == k && temp == 0) {
                temp++;
                // Print single element subarray
                System.out.print("Subarray: ");
                System.out.println(nums[i]);
                continue;
            }

            // Your original check for subarrays before last index
            if (res == k && i != nums.length - 1) {
                count++;
                // Print subarray from j to i
                System.out.print("Subarray: ");
                for (int x = j; x <= i; x++) {
                    System.out.print(nums[x] + " ");
                }
                System.out.println();
            }

            // Your original check for subarrays at last index
            if (res == k && i == nums.length - 1) {
                count++;
                // Print subarray from j to i
                System.out.print("Subarray: ");
                for (int x = j; x <= i; x++) {
                    System.out.print(nums[x] + " ");
                }
                System.out.println();

                j++;
                res = 0;
                i = j - 1; // reset loop as in your logic
            }
        }
        return count + temp;
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
        System.out.println("Enter target: ");
        int target = sc.nextInt();
        int result = subarraysWithXorK(a, target);
        System.out.println("No of sub arrays are: " + result);
        sc.close();
    }
}