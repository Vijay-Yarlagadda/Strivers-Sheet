import java.util.*;

class RepeatMissing {
    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        int n = arr.length;

        List<Integer> missing = new ArrayList<>();
        List<Integer> repeating = new ArrayList<>();

        // Step 1: mark visited
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]) - 1;

            if (arr[idx] < 0) {
                repeating.add(Math.abs(arr[i]));
            } else {
                arr[idx] = -arr[idx];
            }
        }

        // Step 2: find missing
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing.add(i + 1);
            }
        }

        System.out.println("Repeating: " + repeating);
        System.out.println("Missing: " + missing);
    }
}
