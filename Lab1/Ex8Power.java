package Lab1;

import java.util.*;

public class Ex8Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (isPower(num)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static boolean isPower(int n) {
		if (n % 2 != 0) {
			return false;

		} else {
			for (int i = 0; i <= n; i++) {
				if (Math.pow(2, i) == n)
					return true;
			}
		}
		return false;
	}

}
