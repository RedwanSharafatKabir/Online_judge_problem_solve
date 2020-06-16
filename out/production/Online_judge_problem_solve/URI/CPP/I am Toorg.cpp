#include <iostream>
using namespace std;
int main()
{
    string s;
    int n,i;
    cin>>n;
    for(i=0;i<=n;i++)
    {
        getline(cin,s);
        if(i!=0)
            cout<<"I am Toorg!"<<endl;
    }

    return 0;
}
