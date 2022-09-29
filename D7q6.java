import java.util.*;

public class D7q6 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the  two strings");
        String s = ob.next();
        String t= ob.next();
        if(s.length()>t.length())
        System.out.println(1);
        else if(s.length()==t.length())
        {
            if(s.equalsIgnoreCase(t))
            System.out.println(0);
            else{
            for(int i = 0;i<s.length();i++)
            {
                if(s.charAt(i)>t.charAt(i))
               { System.out.println(1); break;}
                else if(s.charAt(i)==t.charAt(i))
                continue;
                else 
                {System.out.println(-1);break;}

            }
        }
        }
        else 
        System.out.println(-1);
    }



    
}
