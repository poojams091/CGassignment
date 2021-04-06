package Lab1;
import java.util.*;
public class Ex2Traffic {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lights");
		String str=sc.next();
		switch(str)
		{
		case "red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Ready");
			break;
		case "green":
			System.out.println("Go");
			break;
		}
		sc.close();
	}

}
