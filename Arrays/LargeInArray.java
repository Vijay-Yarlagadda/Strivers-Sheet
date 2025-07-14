import java.util.*;

class LargeInArray {
    public int largestElement(int[] nums) {
        int i;
        int large = nums[0];
        for (i = 1; i < nums.length; i++) {
            if (nums[i] > large) {
                large = nums[i];
            }
        }
        return large;
    }

    public static void main(String args[]) {
        Scanner l = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = l.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = l.nextInt();
        }
        LargeInArray obj = new LargeInArray();
        int largest = obj.largestElement(arr);
        System.out.println("The largest element in the array is: " + largest);
    }
}