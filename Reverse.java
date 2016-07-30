package simplecodes;

import java.util.Scanner;

public class Reverse {


	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the required string:");
	String str=s.next();
	String rev="";
	//System.out.println(str);
	int length=str.length();
	for(int i=length-1;i>=0;i--)
	{
		rev+=str.charAt(i);
	}
	System.out.println("reverse string is:"+rev);
	}

}
