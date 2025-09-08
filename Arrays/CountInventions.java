import java.util.*;

class CountInventions {
    public static long numberOfInversions(int[] nums) {
        long count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j])
                    count++;
                else
                    continue;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long res = numberOfInversions(arr);
        System.out.println("The final result is: " + res);
        sc.close();
    }
}
