package Lab3;

import java.util.Scanner;

public class Ex2Mirror 
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String: ");
	String str = sc.next();
	Ex2Mirror e = new Ex2Mirror();
	System.out.println(e.reverseWords(str));
	}
	static String reverseWords(String st)
	{
	 StringBuffer sb = new StringBuffer(st);
	 sb.reverse();
	 String str = new String(sb);
	 String s =" ";
	 return st+"|"+str;
	 
	}
	}