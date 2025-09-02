import java.util.*;

class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        sc.close();
        int rev = 0, digit;
        while (n != 0) {
            digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}