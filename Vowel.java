package simplecodes;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='E'||ch=='e'||ch=='O'||ch=='o'||ch=='i'||ch=='I'||ch=='u'||ch=='U')
		{
			System.out.println("IS VOWEL");
		}
		else
		{
		System.out.println("is not vowel");
		}
	}

}
