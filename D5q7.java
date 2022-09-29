import java.util.*;
public class D5q7 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("n");
        int n = ob.nextInt();
        int ar[] = new int[n];
        System.out.println("entre elements");
        for(int i = 0;i<n;i++)
        ar[i]= ob.nextInt();
   
        for(int i = 0;i<n;i++)
        System.out.print(ar[i]+" ");
        System.out.println();
    


        int sum = 0;
        for(int i = 0;i<n;i++)
        {
            if(i<=n-1-i)
            {
            sum = ar[i] +ar[n-1-i];
            ar[i] = sum-ar[i];
            ar[n-1-i]= sum-ar[n-1-i];
            }
            else
            break;
        }

        for(int i = 0;i<n;i++)
        System.out.print(ar[i]+" ");
    
}
}
