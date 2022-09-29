import java.util.*;
public class D7q10 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the string");
        String s = ob.next(); s=s.toLowerCase();
        for(char ch = 'a';ch<='z';ch++)
        { int c=0;int flag = 0;
            for(int i = 0;i<s.length();i++)
            {
                if(s.charAt(i)==ch)
                {c++; flag=1;}
            }
            if(flag==1)
            System.out.println(ch+" : "+c);

        }
    }
    
}
