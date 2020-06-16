#include <stdio.h>
#include <iostream>
using namespace std;
int main()
{
    int i,c1,q1,c2,q2;
    double p1,p2,r1,r2;
    for(i=1;i<=2;i++)
    {
        if(i==1){
            cin>>c1>>q1>>p1;
            r1=q1*p1;
        }
        if(i==2){
            cin>>c2>>q2>>p2;
            r2=q2*p2;
        }
    }
    cout<<"VALOR A PAGAR: R$ ";
    printf("%.2lf\n",(r1+r2));
    return 0;
}
