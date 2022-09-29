
class D2q4
{
    public static void main(String args[])
    {
        int k=1;
        
        for(char i = 'A';i<='D';i++)
        {
            char ch=i;
            for(int j = 1;j<=k;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();k++;
            

        }

    }
}