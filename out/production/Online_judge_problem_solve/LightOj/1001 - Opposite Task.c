#include<stdio.h>
int main()
{
    int n,a[100],i,x=0,y;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
        y=a[i];
        if(a[i]>10){
            x=a[i]-10;
            y=10;
        }
        else
            x=0;
    printf("%d %d\n",x,y);
    }
    return 0;
}
