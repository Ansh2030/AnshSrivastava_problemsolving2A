import java.util.*;
public class D5q5 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("n");
        int n = ob.nextInt();
        int ar[] = new int[n];
         int a = 1;

        
        if(n%2==0)
        {for(int i =0;i<n/2;i++)
            {
                ar[i] = a;
                a=a+2;
            }
            a= n;
            for(int i = n/2;i<n;i++)
        {
            ar[i] = a;a=a-2;}
        } 
        else
        {
            for(int i =0;i<=n/2;i++)
            {
                ar[i] = a;
                a=a+2;
            }

            a=n-1;

        for(int i = n/2+1;i<n;i++)
        {
            ar[i] = a;a=a-2;}
        }

            for(int i = 0;i<n;i++)
            System.out.print(ar[i]+" ");
       
    }
}
