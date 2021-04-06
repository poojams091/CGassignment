package Lab1;
import java.util.*;
public class Ex3Fib {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int s = fib(n);
		System.out.println("Fib of " + n + "is" + s);
		sc.close();
	}

	static int fib(int x) {
		int f1 = 0, f2 = 1;
		while (x > 1) {
			System.out.print(f1 + "  ");
			int f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			x--;
		}
		return f1;
	}

}
