package Lab1;

import java.util.*;

public class Ex6SumofSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int s = SumofSquares(n);

		System.out.println("SumofSquares of Digits=" + s);
		sc.close();
	}

	static int SumofSquares(int num) {
		int Sum = 0;
		do {
			int r = num % 10;
			Sum = Sum + r * r;
			num = num / 10;
		} while (num != 0);
		return Sum;
	}
}
