#include<stdio.h>
int main()
{
    int n,x[1000],i,j,count;
    while(scanf("%d",&n)!=EOF){
    if(n==0)
       break ;
    for(i=0;n>0;i++){
        x[i]=n%2;
        n/=2;
    }
    count=0;
    printf("The parity of ");
    for(i=i-1;i>=0;i--){
        printf("%d",x[i]);
        if(x[i]==1)
            count++;
    }
    printf(" is %d (mod 2).\n",count);
    }
    return 0;
}
