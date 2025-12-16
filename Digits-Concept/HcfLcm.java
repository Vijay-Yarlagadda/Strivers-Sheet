import java.util.*;

public class HcfLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter two numbers:");
            long a = sc.nextLong();
            long b = sc.nextLong();
            long res1 = highCom(a, b);
            long res2 = lowCom(a, b);
            System.out.print("LCM and HCF are: ");
            System.out.println(res2 + " " + res1);
        }
        sc.close();
    }

    static long highCom(long a, long b) {
        while (b != 0) {
            long rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    static long lowCom(long a, long b) {
        return (a / (highCom(a, b)) * b);
    }
}