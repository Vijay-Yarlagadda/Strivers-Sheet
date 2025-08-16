import java.util.*;

public class SingleElement {
    public static int getSingleElement(int[] arr) {
        int xorr = 0;
        for (int i = 0; i < arr.length; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter " + n + " array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
        sc.close();
    }
}
