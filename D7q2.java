import java.util.*;
public class D7q2 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("string");
        String s = ob.next();
        String rev="";
        for(int i = s.length()-1;i>=0;i--)
        {
            rev= rev+s.charAt(i);
        }
        System.out.println(rev);
    }
    
}
