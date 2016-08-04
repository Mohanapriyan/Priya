package simplecodes;

public class Palindrome {

	
	public static void main(String[] args) {
		int n=55655;
		int number=n;
		int a=0,reverse=0;
		while(n!=0)
		{
			a=n%10;
			reverse=reverse*10+a;
			n/=10;
		}
		if(reverse==number)
		{
			System.out.println("the given number is palindrome");
		}
		else
		{
			System.out.println("the given is not a palindrome");
		}
	}

}
