#include"stdio.h"
int main()
{
    int a,b,c,l;
    printf("enter the numbers");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b)
    {
        if(a>c)
        l=a;
        else
        l=c;
    }
    else
    {
        if(b>c)
        l=b;
        else
        l=c;
    }
    printf(" the largest number is %d",l);
    return 0;
}