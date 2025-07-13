import java.util.*;

class BubbleSortTechnique {
    public int[] bubbleSort(int[] nums) {
        int i, j, temp;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 1, 1};

        BubbleSortTechnique s = new BubbleSortTechnique();
        int[] sorted = s.bubbleSort(arr);

        System.out.println("Sorted Array:");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
}
