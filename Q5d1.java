import java.util.*;
class Q5d1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the date");
        int d = ob.nextInt();
        System.out.println("enter teh month");
        int m = ob.nextInt();
        System.out.println("enter the year");
        int y = ob.nextInt(); String st="";
        if(m<3)
        {
            m=m+12;y--;
        }
        int n = d+2*m+(3*(m+1)/5)+y+(y/4)-(y/100)+(y/400)+2;
        int s = n%7;
        switch(s)
        {
            case 0:st="Saturday";break;
            case 1: st="Sunday";break;
            case 2:st="Monday";break;
            case 3: st="tuesday"; break;
            case 4: st="wednesday";break;
            case 5: st="thursday"; break;
            case 6: st="friday"; break;
            default: System.out.println("invalid input");
        }
        System.out.println("the day is "+ st);


    }
}