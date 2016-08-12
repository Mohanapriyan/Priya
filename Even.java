package simplecodes;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int start=s.nextInt();
		int end=s.nextInt();
		for(int i=start;i<end;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}
