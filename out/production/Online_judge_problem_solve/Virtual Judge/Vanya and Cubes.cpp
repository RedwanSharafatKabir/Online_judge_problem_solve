#include<iostream>
using namespace std;

int main()
{
    int n,a=0,b=0,count=0,i;
    cin>>n;
    for(i=1; ;i++)
    {
        a+=i;
        b+=a;
        if(b>n)
            break ;
        else
            count++;
    }
    cout<<count<<endl;
    return 0;
}

