package simplecodes;

public class Fibo {

	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int limit=10,c=0;
		for(int i=0;i<limit;i++)
		{
			c=n1+n2;
			n1=n2;
			n2=c;
			System.out.println(c);
		}

	}

}
