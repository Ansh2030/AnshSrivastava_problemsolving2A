import java.util.*;
public class D7q8 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the string");
        String s = ob.next(); String st="";
        for(int i = 0;i<s.length();i++)
        {
            st+=s.charAt(i);
            System.out.println(st);
        }
    }
}
