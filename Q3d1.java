import java.util.*;
public class Q3d1 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);System.out.println("enter the year");
        int y = ob.nextInt();
        if(y%400==0&&y%100!=0||y%4==0)
        System.out.println("leap year");
        else
        System.out.println("not a leap year");
    }

    
}
