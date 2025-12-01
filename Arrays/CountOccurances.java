import java.util.*;

class CountOccurances {
    public static int countOccurrences(int[] arr, int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        if (first == -1 || last == -1) {
            return 0;
        }
        return last - first + 1;
    }

    public static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target)
                high = mid - 1;
            else
                low = mid + 1;
            if (arr[mid] == target)
                ans = mid;
        }
        return ans;
    }

    public static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target)
                low = mid + 1;
            else
                high = mid - 1;
            if (arr[mid] == target)
                ans = mid;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter target element: ");
        int target = sc.nextInt();
        int result = countOccurrences(a, target);
        System.out.println("The count of occurrences is: " + result);
        sc.close();
    }
}
