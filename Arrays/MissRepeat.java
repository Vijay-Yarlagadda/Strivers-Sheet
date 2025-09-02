import java.util.*;

public class MissRepeat {
    public static int[] findMissingRepeatingNumbers(int[] nums) {
        Arrays.sort(nums);
        int repeat = 0;
        int add = 0;
        int sum = ((nums.length) * (nums.length + 1)) / 2;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                repeat = nums[i];
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            add += nums[i];
        }
        int miss = sum - (add - repeat);
        int res[] = new int[2];
        res[0] = repeat;
        res[1] = miss;
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res[] = findMissingRepeatingNumbers(arr);
        System.out.println("Final answer is: ");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
