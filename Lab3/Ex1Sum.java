package Lab3;
import java.util.*;
public class Ex1Sum 
{
	public static void main(String[] args) {
	System.out.println("ENter the string ");
	Scanner sc= new Scanner(System.in);
	String st=sc.nextLine();
	int sum=0 ;
	for(int i=0 ; i<st.length();i++)
	{
		char ch=st.charAt(i);
		if(ch>='0'&&ch<='9')
		sum=sum+ch-48;
	}
	System.out.println("the total  sum = " + sum);
	sc.close();
	}
	} 

