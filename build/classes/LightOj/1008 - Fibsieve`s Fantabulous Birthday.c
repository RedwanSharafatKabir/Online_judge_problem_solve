#include<stdio.h>
int main()
{
    long long int a[100][100],i,j,n,c,m,p;
    scanf("%lld",&n);
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            scanf("%lld",&a[i][j]);
        }
    }
    scanf("%lld",&c);
    for(m=1;m<=c;m++){
        scanf("%lld",&p);
     for(i=0;i<n;i++){
         for(j=0;j<n;j++){
           if(p==a[i][j])
             printf("Case %lld: %lld %lld",m,j+1,i+1);
         }
     }
    }
    printf("\n");
    return 0;
}
