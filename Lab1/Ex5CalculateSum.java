package Lab1;

import java.util.*;

public class Ex5CalculateSum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int p = calculateSum (a);
		System.out.println("Sum of" + a + "is" + p);
		sc.close();
	}

	static int calculateSum (int n) {
		int Sum = 0;
		while (n > 0) {
			Sum = Sum + n;
			n--;
		}
		return Sum;
	}
}