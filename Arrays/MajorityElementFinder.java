import java.util.*;

class MajorityElementFinder {
    public int majorityElement(int[] nums) {
        int count = 0, element = 0;
        for (int num : nums) {
            if (count == 0) {
                element = num;
            }
            count += (num == element) ? 1 : -1;
        }
        return element;
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
        MajorityElementFinder obj = new MajorityElementFinder();
        int result = obj.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
