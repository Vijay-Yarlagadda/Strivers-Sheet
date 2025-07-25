import java.util.*;

public class LeadersInArray {
    public List<Integer> findLeaders(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int temp = nums[nums.length - 1];
        list.add(temp);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > temp) {
                temp = nums[i];
                list.add(temp);
            }
        }
        Collections.reverse(list);
        return list;
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
        sc.close();
    }
}
