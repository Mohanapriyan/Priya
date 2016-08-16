package simplecodes;

public class Firstlast {

	public static void main(String[] args) {
		int number=123465;
		int first=number%10;
		//System.out.println(first);
		while(number>10)
		{
			number=number/10;
		}
		//System.out.println(number);
		int sum=first+number;
		System.out.println(sum);
		}
	}
