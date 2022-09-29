import java.util.*;
public class D3q7 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the n");
        int n= ob.nextInt();
        int a = 1;
        double sum = 0;

        for(int i =1;i<=n;i++)
        {
            float prod=1;
            for(int j = 1;j<=a;j++)
            prod = prod*j;
            a=a+2;double t;

            if(i%2==0)
         sum = sum-(i/prod);
            else
            sum = sum+(i/prod);
            

            



           
        }
        System.out.println(sum);
        
    }
    
}
