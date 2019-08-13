#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
    double sum=0.0,a[12][12];
    char b[2];
    int row,col,n;
    cin>>n>>b;
     for(row=0;row<3;row++){
        for(col=0;col<3;col++){
            cin>>a[row][col];
            if(col==n)
            sum+=a[row][col];
        }
     }
    if(b[0]=='S')
    cout<<sum<<endl;
    else if(b[0]=='M')
    cout<<setprecision(1)<<fixed<<sum/12.0<<endl;
    return 0;
}
