package Lab1;
import java.util.*;
public class Ex7Increasing {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean bol=false;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int CurrentDigit = num%10;
		num=num/10;
		while(num>0)
		{
			if(CurrentDigit<=num%10)
			{
				bol=true;
				break;
			}
			CurrentDigit = num%10;
			num=num/10;
		}
		if(bol)
		{
			System.out.println("Digits are not in increasing order");
		}
		else {
			System.out.println("Digits are in increasing order");
		}
	}

}
