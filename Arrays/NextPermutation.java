import java.util.*;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int min = Integer.MAX_VALUE, temp = 0, val = 0, element = 0, flag = 0, target = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (i == 1 && nums[i] < nums[i - 1]) {
                target = 1;
            }
            if (nums[i] > nums[i - 1]) {
                temp = i - 1;
                val = nums[temp];
                break;
            }
        }

        if (target != 0) {
            for (int i = 0; i < nums.length / 2; i++) {
                flag = nums[i];
                nums[i] = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = flag;
            }
        } else {
            for (int i = temp + 1; i < nums.length; i++) {
                if ((nums[i] - val) <= min && nums[i] - val > 0) {
                    min = nums[i] - val;
                    element = i;
                }
            }
            flag = nums[temp];
            nums[temp] = nums[element];
            nums[element] = flag;

            int start = temp + 1, end = nums.length - 1;
            while (start <= end) {
                flag = nums[start];
                nums[start] = nums[end];
                nums[end] = flag;
                start++;
                end--;
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
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

        NextPermutation obj = new NextPermutation();
        obj.nextPermutation(nums);
        sc.close();
    }
}
