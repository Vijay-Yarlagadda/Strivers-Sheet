import java.util.*;

public class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i, count = 0, temp = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                temp = Math.max(temp, count);
            } else {
                count = 0;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        ConsecutiveOnes obj = new ConsecutiveOnes();
        int[] nums = { 1, 1, 0, 1, 1, 1, 0, 1 };
        int result = obj.findMaxConsecutiveOnes(nums);
        System.out.println("Maximum consecutive 1s: " + result);
    }
}
