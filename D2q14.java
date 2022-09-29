import java.util.*;
public class D2q14 {

public static void main(String args[])
{
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the n");
    int n = ob.nextInt();

for(int i =0;i<n;i++)
System.out.print("*");

System.out.println();

for(int i =2;i<=n-1;i++)
{
    for(int j =1;j<=n-i;j++)
    System.out.print(" ");
    System.out.print("*");
    System.out.println();

}

for(int i =0;i<n;i++)
System.out.print("*");


    

}

    
}
