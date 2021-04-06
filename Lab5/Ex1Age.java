package Lab5;

import java.util.Scanner;

public class Ex1Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int n = sc.nextInt();
		try {
		if (n < 15) 
			throw new AgeNotFoundException("Invalid");
			else
				System.out.println("Valid");
		}
		catch(AgeNotFoundException ae) {
			System.out.println(ae);
			ae.printStackTrace();
		}
			
				
	}
}
