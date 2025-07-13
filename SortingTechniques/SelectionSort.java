import java.util.*;

class SelectionSort {
    public int[] selectionSort(int[] nums) {
        int i, j, temp;
        for (i = 0; i < nums.length - 1; i++) {
            int pos = i;
            for (j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[pos]) {
                    pos = j;
                }
            }
            temp = nums[pos];
            nums[pos] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 1, 5, 3};

        SelectionSort s = new SelectionSort();
        int[] sorted = s.selectionSort(arr);

        System.out.println("Sorted Array:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
