import java.util.*;
public class D5q6 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("n");
        int n = ob.nextInt();
        int ar[] = new int[n];
        System.out.println("enter the elements");
        for(int i = 0;i<n;i++)
        ar[i] = ob.nextInt();
        for(int i = 0;i<n-1;i=i+2)
        {
            int sum = ar[i]+ar[i+1];
            ar[i]= sum - ar[i];
            ar[i+1]= sum-ar[i+1];
               
        }
        

        for(int i = 0;i<n;i++)
        System.out.print(ar[i]+" ");

    }
}
