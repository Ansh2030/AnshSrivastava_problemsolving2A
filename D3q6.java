import java.util.*;
public class D3q6 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the x");
        int x = ob.nextInt();
        System.out.println("enter the n");
        int n= ob.nextInt();
        double sum = 1;
         n--;int a = 2;
        for(int i = 1;i<=n;i++ )
        {
            int prod=1;
            for(int j = 1;j<=a;j++)
            prod = prod*j;

            if(i%2==0)
            sum = sum+(Math.pow(x,a)/prod);
            else
            sum = sum-(Math.pow(x,a)/prod);
            a=a+2;

        
        }
        System.out.println(sum);
    }
}
