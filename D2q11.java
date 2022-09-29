public class D2q11 {
    public static void main(String args[])
    { int a =10;
        for(int i =1;i<=5;i++)
        {
            for(int j =1;j<=i;j++)
            System.out.print(j);
            a=a-2;

            for(int j =1;j<=a;j++)
            System.out.print(" ");

            for(int j =i;j>=1;j--)
            System.out.print(j);

            System.out.println();


        }
    }
    
}
