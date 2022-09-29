import java.util.*;
public class D2q2 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the limit");
        int n = ob.nextInt(); int p = n-1;
        for(int i =1;i<=n;i++)
        {
            int a=i;
            for(int j = 0;j<p;j++)
            System.out.print(" ");
            p--;

            for(int j =1;j<=i;j++)
           {
             System.out.print(a +" ");
            a++;}
            System.out.println();
        }
    }
    
}

