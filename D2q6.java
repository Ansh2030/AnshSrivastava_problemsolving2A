public class D2q6 {
    public static void main(String args[])
    { int b=1;int a=3; int c=2;
        for(int i=1;i<=4;i++)
        {
            for(int j =1;j<=a;j++)
            System.out.print(" ");
            a--;

            for(int j=i;j<=b;j++)
           System.out.print(j);
           b=b+2;

           if(i>=2)
           {
            for(int j = c;j>=i;j--)
            System.out.print(j);
            c=c+2;

           }


           System.out.println();


        }
    }
    
}
