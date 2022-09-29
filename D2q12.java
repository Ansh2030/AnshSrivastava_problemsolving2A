public class D2q12 {
    public static void main(String args[])
    {
        int a=1;
        for(int i = 6;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            System.out.print(j);

            for(int j =1;j<=a;j++)
           {
            if(i<6)
            {
                System.out.print(" ");
                a=a+2;
            }

           } 
            

            for(int j =i;j>=1;j--)
            { 
                if(j==6)
                continue;
                
                System.out.print(j);}

            System.out.println();
        }
    }
    
}
