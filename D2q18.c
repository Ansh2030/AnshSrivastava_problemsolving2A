#include<stdio.h>
#include<string.h>
void main()
{
    char ch[100];
    printf("enter the string");
    scanf("%s",ch);
    for(int i = 0;i<strlen(ch);i++){
     printf("%s\n",ch);
     ch[i]='.';
    }

}