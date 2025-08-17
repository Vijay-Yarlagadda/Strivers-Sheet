import java.util.*;

class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int count = 0, val = nums.length / 3;
        // System.out.println(val);
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            int temp = nums[j];
            // System.out.println(temp);
            for (int i = j; i < nums.length; i++) {
                if (temp == nums[i]) {
                    count++;
                }
                if (count > val) {
                    // System.out.println("true" + count);
                    count = 0;
                    list.add(temp);
                    break;
                }
            }
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
