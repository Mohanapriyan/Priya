package simplecodes;

import java.util.Scanner;

public class Alphabet {

	
	public static void main(String[] args) {
		char s;
	Scanner c=new Scanner(System.in);
	System.out.println("enter char");
	s=c.next().charAt(0);
	if((s>='a'&& s<='z')  || (s>='A' && s<='Z'))
	{
		System.out.println("is an alphabet");
	}
	else
	{
		System.out.println("is not an alphabet");
	}
	}

}
