import java.util.*;
public class Q1d1 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("entr basic salary");
        int bs= ob.nextInt();
        System.out.println("enter grade");
        char g = ob.next().charAt(0); int all;
        double hra = 0.2*bs , da = 0.5*bs, pf = 0.11*bs;
        if(g=='A')
        all= 1700;
        else if(g=='B')
        all= 1500;
        else
        all = 1300;

        double net = bs+hra+da-pf+all;
        System.out.println(" the net salary is"+net);
        





    }
    
}
