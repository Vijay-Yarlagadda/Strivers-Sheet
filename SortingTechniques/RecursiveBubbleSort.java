import java.util.*;

class RecursiveBubbleSort {
    public static int[] bubbleSort(int a[]) {
        sortSort(a, a.length);
        return a;

    }

    public static void sortSort(int a[], int n) {
        if (n == 1)
            return;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
        }
        sortSort(a, n - 1);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        RecursiveBubbleSort rb = new RecursiveBubbleSort();
        b = rb.bubbleSort(a);
        for (int nums : a) {
            System.out.print(nums + " ");
        }
        sc.close();
    }
}