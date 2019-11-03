#include<stdio.h>
long long name(long long x)
{
    if(x==1)
        return 1;
    else if(x&1)
        return name(3*x+1)+1;
    else if(x%2==0)
        return name(x/2)+1;
}
long long maxcycle(long long a,long long b)
{
    if(a>b)
        return maxcycle(b,a);
    long long max=0,cycle,i;
    for(i=a;i<=b;i++){
        cycle=name(i);
        if(max<cycle)
            max=cycle;
    }
    return max;
}
int main()
{
    long long n,m;
    while(scanf("%lld%lld",&n,&m)!=EOF){
    printf("%lld %lld %lld",n,m,maxcycle(n,m));
    printf("\n");
    }
    return 0;
}
