import java.util.*;
public class D3q4 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the x");
        int x = ob.nextInt();
        System.out.println("limit");
        int n = ob.nextInt();
        double sum = 1-x; 
        for(int i = 2;i<=n-1;i++)
        {int prod=1;
            for(int j = 1;j<=i;j++)
            prod= prod*j;


            if(i%2==0)
            sum = sum+(Math.pow(x,i)/prod);
            else
            sum = sum-(Math.pow(x,i)/prod);

        }
        System.out.println(sum);
    }
    
}
