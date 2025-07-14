import java.util.*;

class KthSmallest {
    public int findKthSmallest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();            
		 }
        }

        return pq.peek();     }

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
        KthSmallest sol = new KthSmallest();
        int result = sol.findKthSmallest(arr, k);
        System.out.println("Kth Smallest Element: " + result);
    }
}
