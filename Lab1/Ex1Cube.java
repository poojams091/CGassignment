package Lab1;
import java.util.*;
public class Ex1Cube {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum=0;
		while(num!=0)
		{
			int d =num%10;
			sum=sum+d*d*d;
			num=num/10;
		}
		System.out.println("The sum of cubes is"+sum);
		sc.close();
	}

}
