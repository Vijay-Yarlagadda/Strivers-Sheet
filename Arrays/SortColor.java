import java.util.*;

class SortColor {
    public void sortColors(int[] nums) {
        int n = nums.length / 3;
        int j = 0;
        int a[] = new int[nums.length];
        for (int i = 0; i < nums.length; i += n) {
            for (int k = 0 + i; k < n + i; k++) {
                a[k] = j;
            }
            j++;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        SortColor scs = new SortColor();
        scs.sortColors(a);
    }
}