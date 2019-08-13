#include<stdio.h>
#include <iostream>
using namespace std;
int main()
{
    int n,k;
    while(scanf("%d%d",&n,&k)!=EOF){
        cout<<(n+(n-1)/(k-1))<<endl;
    }
    return 0;
}
