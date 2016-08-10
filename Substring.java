package simplecodes;

public class Substring {
public static void main(String[] args) {
       String s="hello";
        if (s.length()== 1) {
            System.out.println(s);
            return;
        }
        else
        {
            System.out.println(s);
            String str=s.substring(0, s.length()-1); 
            String str1=s.substring(1, s.length());
            System.out.println(str+str1);
        }
    
    }

}
