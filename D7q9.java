import java.util.*;
public class D7q9 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the string");
        String s = ob.next(); String st="";int a = s.length()-1;
        for(int i = 0;i<s.length();i++)
        { st="";
            for(int j = a;j<=s.length()-1;j++)
            {st+=s.charAt(j);}
            System.out.println(st);a--;
        }
    }
    
}
