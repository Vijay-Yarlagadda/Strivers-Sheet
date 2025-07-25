import java.util.*;

public class LeadersInArray {
    public List<Integer> findLeaders(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = nums[nums.length - 1];
        leaders.add(maxFromRight);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                maxFromRight = nums[i];
                leaders.add(maxFromRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        LeadersInArray obj = new LeadersInArray();
        List<Integer> result = obj.findLeaders(nums);
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
