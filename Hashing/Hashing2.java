import java.util.*;

class Hashing2 {
    public int mostFrequentElement(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int[] hash = new int[max + 1];

        for (int num : nums) {
            hash[num] += 1;
        }

        int temp = 0;
        int element = -1; // to store the number with max frequency

        for (int i = 0; i <= max; i++) {
            if (hash[i] > temp) {
                temp = hash[i];
                element = i;
            }
        }

        return element;
    }

    // ✅ main function to test
    public static void main(String[] args) {
        int[] arr = {4, 4, 5, 5, 6};
        Hashing2 sol = new Hashing2();
        int result = sol.mostFrequentElement(arr);
        System.out.println("Most frequent element: " + result); // Output: 3
    }
}
