import java.util.*;

public class SubArrWithXorK {
    public static int subarraysWithXorK(int[] nums, int k) {
        int count = 0, temp = 0;
        int j = 0;
        int res = 0;
        for (int i = j; i < nums.length; i++) {
            res ^= nums[i];
            if (nums[i] == k && temp == 0) {
                temp++;
                continue;
            }
            if (res == k && i != nums.length - 1)
                count++;
            if (res == k && i == nums.length - 1) {
                count++;
                j++;
                res = 0;
                i = j - 1;
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