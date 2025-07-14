import java.util.*;

class KthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); // remove smallest to maintain size k
            }
        }

        return pq.peek(); // top of min heap = kth largest
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // Input array elements
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        KthLargest sol = new KthLargest();
        int result = sol.findKthLargest(arr, k);
        System.out.println("Kth Largest Element: " + result);
    }
}
