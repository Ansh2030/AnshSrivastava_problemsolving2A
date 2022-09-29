import java.util.*;
public class D7q13 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the no. of cities");
        int n = ob.nextInt();
        System.out.println("enter names");
        String s[]= new String[n];
        for(int i =0;i<n;i++)
        s[i]= ob.next();

        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<n-1-i;j++)
            {
                if(s[j].compareTo(s[j+1])<0)
                {
                    String f = s[i];s[i]=s[i+1];
                    s[i+1]=f;
                }
            }
        }
        System.out.println("cites according to dictionary:");
        for(int i = 0;i<n;i++)
        System.out.println(s[i]);
    }
}
