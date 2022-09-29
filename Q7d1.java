import java.util.*;


public class Q7d1 {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the temp");
        int t = ob.nextInt();
        if(t<0)
        System.out.println("freezing weather");
        else if(t>=0&&t<10)
        System.out.println("very cold weather");
        else if(t>=10&&t<20)
        System.out.println("cold weather");
        else if(t>=20 &&t<30)
        System.out.println("normal in temprature");
        else if(t>=30&&t<40)
        System.out.println("its hot");
        else 
        System.out.println("very hot");

    }
    
}
