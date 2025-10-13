import java.util.*;

public class GetFloorAndCeil {
    public static int findCeil(int[] nums, int x) {
        int low = 0, high = nums.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= x) {
                ans = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int findFloor(int[] nums, int x) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= x) {
                ans = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {
        int c = findCeil(nums, x);
        int f = findFloor(nums, x);
        return new int[] { f, c };
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        int res[] = getFloorAndCeil(a, target);
        System.out.println("The floor and ceil values are: ");
        for (int ele : res) {
            System.out.println(ele);
        }
        sc.close();
    }
}
