package simplecodes;

public class Diamend {

	public static void main(String[] args) {
		int limit=4;
		for(int i=1;i<=limit;i++)
		{
			for(int k=limit-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"");
			}
			System.out.println("");
		}
		for(int i=limit-1;i>=1;i--)
		{
			for(int k=limit-1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(i+"");
			}
			System.out.println("");
		}
      }
	}
