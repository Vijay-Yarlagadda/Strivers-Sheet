import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int b[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    b[0] = i;
                    b[1] = j;
                    return b;
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoSum obj = new TwoSum();

        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = obj.twoSum(nums, target);
        System.out.println("Indexes: " + result[0] + ", " + result[1]);
    }
}
