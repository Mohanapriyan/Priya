package simplecodes;

public class Pascal {

	public static void main(String[] args) {
		int limit=5;
		int z=1;
		for(int i=0;i<limit;i++)
		{
			for(int j=limit-1;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<z;k++)
			{
				System.out.print(z-i);
			}
			z+=2;
			System.out.println();
		}
	}

}
