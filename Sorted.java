package simplecodes;

public class Sorted {

	public static void main(String[] args) {
	   int arr[]={3,5,4,6,1,7,8};
	   for(int i=1;i<arr.length;i++)
	   {
		   if(arr[i-1]>arr[i])
		   {
			  System.out.println("array is not sorted");
		   }
		   else
		   {
			   System.out.println("array is sorted");
		   }
	   }
	 
	}

}
