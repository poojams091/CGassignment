package Lab3;
import java.util.Scanner;
public class Ex4Number 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		Ex4Number e = new Ex4Number();
		System.out.println(e.modifyNumber(num));
		}
	static int modifyNumber(int n)
	{
		String str=" ";
		str+=n;
		StringBuffer sb = new StringBuffer();
		if(str.length()%2==0)
		{
			for(int i=0;i<str.length()-1;i++)
			{
				char ch=str.charAt(i);
				char ch1=str.charAt(i+1);
				sb.append(Math.abs((int)ch1-(int)ch));
			}
		}
		else
		{
			for(int i=0;i<str.length()-1;i++)
			{
				char ch=str.charAt(i);
				char ch1=str.charAt(i+1);
				sb.append(Math.abs((int)ch-(int)ch1));
			}
			sb.append(str.charAt(str.length()-1));
		}
		String s = sb.toString();
		return Integer.parseInt(s);
	}
}
