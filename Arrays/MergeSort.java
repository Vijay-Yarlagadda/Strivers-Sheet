import java.util.*;

class MergeSort {
    public int[] mergeSort(int[] nums) {
        mergeSorting(nums, 0, nums.length - 1);
        return nums;
    }

    public void mergeSorting(int arr[], int low, int high) {
        int mid;
        if (low < high) {
            mid = (low + high) / 2;
            mergeSorting(arr, low, mid);
            mergeSorting(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public int[] merge(int a[], int low, int mid, int high) {
        int i = low, j = mid + 1, k = low, x;
        int b[] = new int[a.length];
        while (i <= mid && j <= high) {
            if (a[i] > a[j]) {
                b[k] = a[j];
                j++;
            } else {
                b[k] = a[i];
                i++;
            }
            k++;
        }
        if (i > mid) {
            for (x = j; x <= high; x++) {
                b[k] = a[x];
                k++;
            }
        } else {
            for (x = i; x <= mid; x++) {
                b[k] = a[x];
                k++;
            }
        }
        for (x = low; x <= high; x++) {
            a[x] = b[x];
        }
        return a;
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
        MergeSort sol = new MergeSort();
        nums = sol.mergeSort(nums);
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}