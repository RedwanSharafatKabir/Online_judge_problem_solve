#include<iostream>
using namespace std;
int main()
{
    int n,a,p,i,sum=0,x=101;
    cin>>n;
    for(i=0;i<n;i++)
    {
        cin>>a>>p;
        if(p < x){
            x = p;
        }
        sum += a*x;
    }
    cout<<sum<<endl;
    return 0;
}
