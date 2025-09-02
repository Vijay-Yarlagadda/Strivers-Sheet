import java.util.*;

public class MergeSortedArr {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = n + m;
        int res[] = new int[size];
        for (int i = 0; i < m; i++) {
            res[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            res[m + i] = nums2[i];
        }
        Arrays.sort(res);
        for (int i = 0; i < size; i++) {
            System.out.print(res[i]);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first array size: ");
        int size1 = sc.nextInt();
        int nums1[] = new int[size1];
        System.out.println("Enter first array elements: ");
        for (int i = 0; i < size1; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println("Enter no of elements in first array: ");
        int m = sc.nextInt();
        System.out.println("Enter second array size: ");
        int size2 = sc.nextInt();
        int nums2[] = new int[size1];
        System.out.println("Enter second array elements: ");
        for (int i = 0; i < size2; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println("Enter no of elements in second array: ");
        int n = sc.nextInt();
        merge(nums1, m, nums2, n);
        sc.close();
    }
}
