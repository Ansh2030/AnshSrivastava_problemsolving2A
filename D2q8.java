public class D2q8 {
    public static void main(String args[])
    { int a = 3; int b=1;
        for(int i =1;i<=4;i++)
        {
            for(int j =1;j<=a;j++)
            System.out.print(" ");
            a--;
            for(int j = 1;j<=b;j++)
            System.out.print("*");
            b=b+2;
            System.out.println();
        }
    }
    
}
