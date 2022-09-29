import java.util.*;
public class D7q4 {
     public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the paragraph");
        String s = ob.nextLine();
        int c = 0;
        s=s.trim();
        for(int i = 0;i<s.length()-1;i++)
        {
            if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
            c++;

        }
        c=c+1;
        System.out.println("no. of words are : "+c);
    }

}
