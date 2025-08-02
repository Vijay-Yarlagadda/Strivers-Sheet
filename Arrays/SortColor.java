import java.util.*;

class SortColor {
    public void sortColors(int[] nums) {
        int one = 0, zero = 0, two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero++;
            else if (nums[i] == 1)
                one++;
            else
                two++;
        }
        for (int i = 0; i < zero; i++) {
            nums[i] = 0;
        }
        for (int i = zero; i < one + zero; i++) {
            nums[i] = 1;
        }
        for (int i = one + zero; i < nums.length; i++) {
            nums[i] = 2;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        SortColor scs = new SortColor();
        scs.sortColors(a);
        sc.close();
    }
}