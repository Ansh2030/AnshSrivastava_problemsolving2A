import java.util.*;
public class D2q7 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the n ");
        int n = ob.nextInt();
        for(int i =1;i<=n;i++)
        {
            for(int j =i;j<=n-1;j++)
            System.out.print(" ");

            for(int j =i;j>=1;j--)
            System.out.print(j);

            if(i>=2)
            {
                for(int j =2;j<=i;j++)
                System.out.print(j);
            }

            System.out.println();

        }
    }
    
}
