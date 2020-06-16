#include<stdio.h>
int main()
{
    int a,i;
    scanf("%d",&a);
    printf("%d\n",a>0?a*(a+1)/2:1+a*(1-a)/2);
    return 0;
}
