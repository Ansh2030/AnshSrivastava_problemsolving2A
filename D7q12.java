import java.util.*;
public class D7q12 {
     public static boolean isKeyword(String s)
    {
        String keyword[]={
            "auto","double","int","struct","break","else","long",
            "switch","case","enum","register","typedef","char",
            "extern","return","union","const","float","short",
            "unsigned","continue","for","signed","void","default",
            "goto","sizeof","voltile","do","if","static","while"
         } ;
         int f = 0;
         for(int i = 0;i<keyword.length;i++)
         {
            if(keyword[i].compareTo(s)==0)
            f=1;
         }
         if(f==1)
         return(true);
         else 
         return(false);
    }

    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the string");
        String s = ob.next(); 
        if(isKeyword(s))
        System.out.println("keywords not allowed");

         else if(Character.isLetter(s.charAt(0))|| s.charAt(0)=='_')
        { int c = 0;
            for(int i = 0;i<s.length();i++)
            {
                if(Character.isLetter(s.charAt(i))|| s.charAt(i)=='_' || Character.isDigit(s.charAt(i)))
                    c++;
            }
            if(c==s.length())
            System.out.println("valid name");
            else
            System.out.println("invalid name");
        }
        else
        System.out.println("invalid : start with letter or _");
    }
}
