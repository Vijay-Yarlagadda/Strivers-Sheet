import java.util.*;

class MinOperators {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int operators = 0, index = 0;
        for (int d : nums) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }
        while (true) {
            boolean isDupExists = false;
            for (int x : map.values()) {
                if (x > 1) {
                    isDupExists = true;
                    break;
                }
            }
            if (!isDupExists)
                return operators;
            if (index >= nums.length)
                return operators;
            operators++;
            for (int i = 0; i < 3 && index < nums.length; i++) {
                int val = nums[index];
                map.put(val, map.get(val) - 1);
                if (map.get(val) == 0) {
                    map.remove(val);
                }
                index++;
            }
        }
    }

    public static void main(String[] args) {

        MinOperators obj = new MinOperators();

        // Example input
        int[] nums = { 3, 8, 3, 6, 5, 8 };

        int result = obj.minOperations(nums);

        System.out.println("Minimum operations = " + result);
    }
}
