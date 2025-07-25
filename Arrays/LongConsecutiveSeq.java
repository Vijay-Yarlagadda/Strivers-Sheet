import java.util.*;

class LongConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        // System.out.println("Sorted array: " + Arrays.toString(nums));
        int count = 0, temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i + 1] - nums[i]) == 1) {
                count++;
                temp = Math.max(count, temp);
            } else {
                count = 0;
            }
        }
        return temp + 1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        LongConsecutiveSeq obj = new LongConsecutiveSeq();
        int result = obj.longestConsecutive(nums);
        System.out.println("Longest consecutive sequence length: " + result);
        sc.close();
    }
}