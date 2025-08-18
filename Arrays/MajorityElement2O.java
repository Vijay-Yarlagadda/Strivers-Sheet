import java.util.*;

public class MajorityElement2O {
    public List<Integer> majorityElement(int nums[]) {
        int cnt1 = 0, cnt2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (cnt1 == 0 && ele2 != nums[i]) {
                cnt1 = 1;
                ele1 = nums[i];
            } else if (cnt2 == 0 && ele2 != nums[i]) {
                cnt2 = 1;
                ele2 = nums[i];
            } else if (ele1 == nums[i])
                cnt1++;
            else if (ele2 == nums[i])
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        int val = (nums.length) / 3;
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ele1 == nums[i])
                cnt1++;
            if (ele2 == nums[i])
                cnt2++;
        }
        if (cnt1 > val)
            list.add(ele1);
        if (cnt2 > val)
            list.add(ele2);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        MajorityElement2O sol = new MajorityElement2O();
        List<Integer> ans = sol.majorityElement(nums);
        System.out.println("Majority Elements: " + ans);
        sc.close();
    }
}
