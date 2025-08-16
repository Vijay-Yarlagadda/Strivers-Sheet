import java.util.*;

class RecursiveInsertion {
    public int[] insertionSort(int[] nums) {
        sortSort(nums, nums.length, 1);
        return nums;
    }

    public static void sortSort(int a[], int n, int i) {
        int j;
        if (i == n)
            return;
        int x = a[i];
        j = i - 1;
        while (j >= 0 && a[j] > x) {
            a[j + 1] = a[j];
            j--;
        }
        a[j + 1] = x;
        sortSort(a, n, i + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        RecursiveInsertion ri = new RecursiveInsertion();
        System.out.println("Enter array size: ");
        int n;
        n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int arr[] = ri.insertionSort(nums);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}