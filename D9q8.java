class D9q8 {
    public static int trailingZeroes(int n) {
        double fact=1;
        for(int i =1;i<=n;i++)
        {
            fact= fact*i;
        }
        int c = 0;
        System.out.println(fact);
        while(fact>0)
        {
            long d = (long)fact%10;
            if(d==0)
            c++;

            else{
                break;
            }
            
            fact/=10;

        }
        return(c);
    }
    public static void main(String args[]){
        System.out.println(trailingZeroes(30));
    }
}