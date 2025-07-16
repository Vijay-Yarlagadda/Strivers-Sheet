import java.util.Scanner;

class QuickSort {
    public int[] quickSort(int[] nums) {
        quickSorting(nums, 0, nums.length - 1);
        return nums;
    }

    public void quickSorting(int a[], int low, int high) {
        int loc;
        if (low < high) {
            loc = partition(a, low, high);
            quickSorting(a, low, loc - 1);
            quickSorting(a, loc + 1, high);
        }
    }

    public int partition(int a[], int low, int high) {
        int i = low, j = high, temp, pivot = a[low];
        while (i < j) {
            while (a[i] <= pivot)
                i = i + 1;
            while (a[j] > pivot)
                j = j - 1;
            if (i < j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[low] = a[j];
        a[j] = pivot;
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        QuickSort sol = new QuickSort();
        nums = sol.quickSort(nums);
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}