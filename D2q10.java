public class D2q10 {
    public static void main(String args[])
    {
        int a =0;
        for(int i = 5;i>=1;i=i-2)
        {
            for(int j = 1;j<=a;j++)
            System.out.print(" ");
            a++;

            for(int j =1;j<=i;j++)
            System.out.print("*");

            System.out.println();
        }

        a=1;
        for(int i =3;i<=5;i=i+2)
        {
            for(int j =1;j<=a;j++)
            System.out.print(" ");
            a--;

            for(int j =1;j<=i;j++)
            System.out.print("*");
            System.out.println();
        }
    }
    
}
