import java.util.*;

class MergeOverLaps {
    public static int[][] merge(int[][] intervals) {
        int n = intervals.length;

        // Sort by start time
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        List<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1)[1]) {
                ans.add(new int[] { intervals[i][0], intervals[i][1] });
            } else {
                ans.get(ans.size() - 1)[1] = Math.max(ans.get(ans.size() - 1)[1], intervals[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of pairs: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        System.out.println("Enter pairs: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] merged = merge(arr);
        System.out.println("Overlapped pairs are: ");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
        sc.close();
    }
}
