/*#include<stdio.h>
int main()
{
    long long a,b,c,n,i,F1=1,F2=1,F3=1,total;
    while(scanf("%lld %lld",&a,&b)==2){
    if(a==0&&b==0)
        return 0;
    if(a<b){
        c=a;
        a=b;
        b=c;
    }
    for(i=a;i>=1;i--){
        F1*=i;
    }
    for(i=a-b;i>=1;i--){
        F2*=i;
    }
    for(i=b;i>=1;i--){
        F3*=i;
    }
    total=F1/(F2*F3);
    printf("%lld things taken %lld at a time is %lld exactly.\n",a,b,total);
    total=0;F1=1;F2=1;F3=1;
    }
    return 0;
}*/
#include<stdio.h>
long long nCr(long long n,long long m)
{
long long res=1,i;
if(n-m<m)
m=n-m;
for(i=1;i<=m;i++,n--){
res=res*n;
res=res/i;
}
return res;
}
int main(){
long long n,r;
while(scanf("%lld%lld",&n,&r)==2)
{
    if(n==0&&r==0)
        break;
    printf("%lld things taken %lld at a time is %lld exactly.\n",n,r,nCr(n,r));
}
return 0;
}
