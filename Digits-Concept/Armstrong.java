import java.util.*;

class Armstrong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int digit, num = 0;
		int temp = n;
		int count = String.valueOf(n).length();
		while (n > 0) {
			digit = n % 10;
			num += Math.pow(digit, count);
			n = n / 10;
		}
		System.out.println(num == temp);
		sc.close();
	}
}