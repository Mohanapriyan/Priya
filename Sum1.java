package simplecodes;

public class Sum1 {
	

	public static int output1;
	static int x=0;
	public static void main(String[] args) {
		Sum1 s=new  Sum1();
        s.userMethod(1234);
        System.out.println(output1);
	 }
	public  void userMethod(int input1){
		int number=input1;
		
		while(number!=0){
			x+=number%10;
			number=number/10;
		}
		input1=input1/10;
		if(input1 >0){
			userMethod(input1);
		}
		output1=x;
	}

}
