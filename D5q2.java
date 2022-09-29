import java.util.*;
public class D5q2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("n");
        int n = ob.nextInt();
        int ar[] = new int[n];
        System.out.println("entre elements");
        for(int i = 0;i<n;i++)
        ar[i]= ob.nextInt();
        int max= 0;
        for(int i = 0;i<n;i++)
        if(ar[i]>max)
        max = ar[i];

        System.out.println("no. of days are"+max);

    }
}
