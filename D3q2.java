import java.util.*;
public class D3q2 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("n");
        int n = ob.nextInt();
        double sum = 0; int prod=1;
        for(int i = 1;i<=n;i++)
        {
            prod = prod*i;
            sum = sum+(prod/i);


        }
        System.out.println(sum);

    }
    
}
