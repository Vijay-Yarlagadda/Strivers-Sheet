import java.util.*;

public class RearrangeArray {
    public int[] rearrangeArray(int[] nums) {
        int b[] = new int[nums.length];
        int i = 0, j = 1;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] > 0) {
                b[i] = nums[k];
                i = i + 2;
            }
            if (nums[k] < 0) {
                b[j] = nums[k];
                j = j + 2;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements (equal number of +ve and -ve):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        RearrangeArray obj = new RearrangeArray();
        int[] res = obj.rearrangeArray(nums);
        System.out.println("Rearranged array:");
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
