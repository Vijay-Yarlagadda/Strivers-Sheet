import java.util.*;

class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int count = 0, val = nums.length / 3;
        // System.out.println(val);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.size() == 0 || list.get(0) != nums[i]) {
                count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
                if (count > val) {
                    list.add(nums[i]);
                }
            }
            if (list.size() == 2)
                break;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Input array
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call method
        MajorityElement2 sol = new MajorityElement2();
        List<Integer> ans = sol.majorityElement(nums);

        // Print result
        System.out.println("Majority Elements: " + ans);

        sc.close();
    }
}
