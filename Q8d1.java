import java.util.*;


public class Q8d1 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the x and y");
        int x = ob.nextInt();
        int y = ob.nextInt();
        if(x>=0&&y>=0)
        System.out.println("first");
        else if(x>0&&y<0)
        System.out.println("fourth");
        else if(x<0&&y>0)
        System.out.println("second");
        else 
        System.out.println("third");

    }
    
}
