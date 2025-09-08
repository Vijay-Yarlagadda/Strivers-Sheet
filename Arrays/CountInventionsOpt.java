import java.util.*;

class CountInventionsOpt {
    public static int merge(int[] arr, int low, int mid, int high) {
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                count += (mid - left + 1);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= high) {
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }
        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high)
            return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    public static long numberOfInversions(int[] nums) {
        long count = mergeSort(nums, 0, nums.length - 1);
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
