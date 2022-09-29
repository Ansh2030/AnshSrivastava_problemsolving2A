import java.util.*;
class D5q1
{
     public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("n");
        int n = ob.nextInt();
        int ar[] = new int[n];
        System.out.println("tastynes level");
        for(int i = 0;i<n;i++)
        ar[i]= ob.nextInt();

        int min = ar[0];
        for(int i = 0;i<n;i++)
        {
            if(ar[i]< min)
            min = ar[i];
        }
        System.out.println("the sister gets bread of tastyness level "+min);
        
                
    }
}