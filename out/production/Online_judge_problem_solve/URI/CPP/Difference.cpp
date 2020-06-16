#include <iostream>
using namespace std;
int main()
{
    int i,A,B,C,D;
    for(i=1;i<=4;i++)
    {
        if(i==1){
            cin>>A;
        }
        if(i==2){
            cin>>B;
        }
        if(i==3){
            cin>>C;
        }
        if(i==4){
            cin>>D;
        }
    }
    cout<<"DIFERENCA = "<<((A*B)-(C*D))<<endl;
    return 0;
}
