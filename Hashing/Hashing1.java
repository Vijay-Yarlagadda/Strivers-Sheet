import java.util.*;

class Hashing1 {
    public List<List<Integer>> countFrequencies(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int[] hash = new int[max + 1];
        List<List<Integer>> list = new ArrayList<>();

        for (int num : nums) {
            hash[num] += 1;
        }

        for (int i = 0; i <= max; i++) {
            if (hash[i] > 0) {
                List<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(hash[i]);
                list.add(pair);
            }
        }

        return list;
    }

    // ✅ main function to test
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 3};
        Hashing1 sol = new Hashing1();
        List<List<Integer>> result = sol.countFrequencies(arr);

        // Printing the result
        for (List<Integer> pair : result) {
            System.out.println(pair);
        }
    }
}
