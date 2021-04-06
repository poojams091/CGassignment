package Lab1;

import java.util.*;

public class Ex4Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = sc.nextInt();
		Ex4Prime p = new Ex4Prime();
		p.primeNumbers(a);
		sc.close();
		}
	
public void primeNumbers(int x) {
		for (int i = 2; i <= x; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i + " ");
			}
		}

	}

}
