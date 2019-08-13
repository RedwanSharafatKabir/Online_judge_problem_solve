#include<stdio.h>
#include <iostream>
using namespace std;
int main()
{
    int n,k,x;
    while(scanf("%d %d",&n,&k)==2 && k>1)
    {
        x=n;
        while(n>=k)
        {
            x = x+(n/k);
            n = (n/k)+(n%k);
        }
        cout<<x<<endl;
    }
    return 0;
}
