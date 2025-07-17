import java.util.*;

class Union {
    public int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>(); // Sorted set
        for (int num : nums1) set.add(num);
        for (int num : nums2) set.add(num);

        int[] result = new int[set.size()];
        int k = 0;
        for (int j : set) result[k++] = j;

        return result;
    }

    public static void main(String[] args) {
        Union sol = new Union();

        int[] nums1 = {5, 2, 8, 1};
        int[] nums2 = {3, 2, 7, 8};

        int[] union = sol.unionArray(nums1, nums2);

        System.out.println("Union of arrays:");
        System.out.println(Arrays.toString(union));
    }
}
