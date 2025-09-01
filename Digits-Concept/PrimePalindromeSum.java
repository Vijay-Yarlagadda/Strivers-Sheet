
// import java.io.*;
import java.util.*;

public class PrimePalindromeSum {
    public static int palindrome(int n) {
        int rev = 0, digit = 0;
        while (n != 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    public static boolean prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                int rev = palindrome(i);
                if (prime(rev)) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}