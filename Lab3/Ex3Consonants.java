package Lab3;
import java.util.Scanner;
public class Ex3Consonants 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		Ex3Consonants e = new Ex3Consonants();
		System.out.println(e.alterString(str));
	}
	String alterString(String str)
	{
		String st = "";
		int num=0;
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' )
			{
				st+=ch;
			}
			else
			{
				num=1+(int)ch;
				st=st+(char)num;
			}
		}
		return st;
						
			}
		
}
