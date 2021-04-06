package Lab3;
import java.util.Scanner;
public class Ex8Positive {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		Ex8Positive e = new Ex8Positive();
		System.out.println(e.positiveString(str));
		
	}
	static boolean positiveString(String st)
	{
		int length=st.length();
		for(int i=0;i<length-1;i++)
		{
			if(st.charAt(i)>st.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}

}
