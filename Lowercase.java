package simplecodes;

public class Lowercase {

	public static void main(String[] args) {
	String str="WELCOMETOGUVI";
	String s1=str.substring(0, 2).toLowerCase();
	int l=str.length()-1;
    String ch=str.substring(12,13).toLowerCase();
    System.out.println(s1+str.subSequence(3,l)+ch);
	}

}
