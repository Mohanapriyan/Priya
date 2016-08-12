package simplecodes;

public class Second {

	public static void main(String[] args) {
		int n[]={2,4,5,3,-1,0,6};
		int small=Integer.MAX_VALUE;
		int secondsmall=Integer.MAX_VALUE;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==small)
			{
				secondsmall=small;
			}
			else if(n[i]<small)
			{
				secondsmall=small;
				small=n[i];
			}
			else if(n[i]<secondsmall)
				secondsmall=n[i];
		}
        System.out.println(secondsmall);
	}

}
