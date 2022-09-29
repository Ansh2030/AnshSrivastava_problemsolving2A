import java.util.*;
public class D3q8 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the n");
        int n= ob.nextInt(); int sum = 0;
        for(int i =1;i<=n;i++)
        {
            sum = sum+(i*(i+1)*(i+2));

        }
        System.out.println(sum);
    }    
}
