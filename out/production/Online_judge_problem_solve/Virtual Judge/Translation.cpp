#include<iostream>
using namespace std;
int main()
{
    int i;
    string a,b,c="";
    cin>>a;
    cin>>b;
    for(i=(a.size()-1);i>=0;--i)
    {
        c = c+a[i];
    }
    if(c==b)
    {
        cout<<"YES\n";
    }
    else
    {
        cout<<"NO\n";
    }
}
