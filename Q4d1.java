import java.util.*;
class Q4d1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch = ob.next().charAt(0);
        char c= Character.toUpperCase(ch);
        if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        System.out.println("vowel");
        else
        System.out.println("consonent");
    }
    

}