#include<iostream>
using namespace std;

int main()
{
    int n,a;
    while(cin>>n){
        if(n==0)
            break ;
        else {
            a=(n>=101?n-10:91);
            cout<<"f91("<<n<<") = "<<a<<endl;
        }
    }
    return 0;
}
