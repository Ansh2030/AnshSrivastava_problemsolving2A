import java.util.*;
public class D3q1 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("n");
        int n = ob.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++)
        { int t = 1;
            for(int j = 1;j<=i;j++)
            {
                t=t*j;

            }
            sum = sum+t;
        }
        System.out.println("Sum is "+sum);
    }
}
