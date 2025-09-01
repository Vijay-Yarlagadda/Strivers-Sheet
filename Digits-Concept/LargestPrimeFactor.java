import java.util.*;

public class LargestPrimeFactor {
    public static boolean prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int primeFactor(int num) {
        int temp = -1;
        if (num <= 1)
            return num;
        for (int i = 2; i < num; i++) {
            if (num % i == 0 && prime(i)) {
                temp = i;
            }
        }
        if (temp == -1) {
            temp = num;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of inputs: ");
        int n = sc.nextInt();
        System.out.println("Enter inputs: ");
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            System.out.println(primeFactor(num));
        }
        sc.close();
    }
}
