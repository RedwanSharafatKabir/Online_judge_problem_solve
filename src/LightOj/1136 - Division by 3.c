#include<stdio.h>
int main()
{
    int n,i,j,k,a,b,sum;
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        scanf("%d%d",&a,&b);
        j=a/3*2;
        if(a%3==2)
            j++;
        k=b/3*2;
        if(b%3==2)
            k++;
        sum=k-j;
        sum++;
        if(a%3==1)
            sum--;
        printf("Case %d: %d\n",i,sum);
    }
    return 0;
}
