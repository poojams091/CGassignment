package Lab3;

import java.util.Scanner;

public class Ex5Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = sc.next();

		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;
		}

		System.out.println("Total number of characters in a string: " + count);
	}
}
