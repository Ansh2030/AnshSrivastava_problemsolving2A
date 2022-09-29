import java.util.*;
public class D2q17 {
    public static void main(String args[])
{
    Scanner ob = new Scanner(System.in);
    System.out.println("n");
    int n = ob.nextInt(); int a = 1;
    for(int i = 1;i<=n;i++)
    {
        for(int j = 1;j<=i;j++)
        System.out.print(j);

        if(i>=2)
        {
            for(int j=a;j>=1;j--)
            System.out.print(j);
            a++;
        }
        System.out.print(" ");

    }
}    
}
