package simplecodes;

import java.util.Scanner;

public class Oddsum{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int limit=s.nextInt();
		int sum=0;
		for(int i=0;i<=limit;i++)
		{
			if(i%2==1)
			{   
				sum+=i;
			}
		}
     System.out.println(sum);
	}

}
