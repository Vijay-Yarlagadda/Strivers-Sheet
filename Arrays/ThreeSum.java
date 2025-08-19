import java.util.*;

class ThreeSum {

    public static List<List<Integer>> threeSum(int nums[]) {
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(st);
        return list;
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
        // ThreeSum ts = new ThreeSum();
        List<List<Integer>> ans = threeSum(a);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (int i : it) {
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
        System.out.println();
        sc.close();
    }
}
