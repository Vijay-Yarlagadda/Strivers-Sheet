import java.util.*;

class InsertionSort {
    public int[] insertionSort(int[] nums) {
        int i = 1, j;
        while (i < nums.length) {
            int x = nums[i];
            j = i - 1;
            while (j >= 0 && nums[j] > x) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = x;
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 5, 2, 1};

        InsertionSort s = new InsertionSort();
        int[] sorted = s.insertionSort(arr);

        System.out.println("Sorted Array:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
