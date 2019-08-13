#include<iostream>
using namespace std;

int main()
{
    int i,j,m,p,a[20];
    for(i=0;i<20;i++){
        cin>>a[i];
    }
    for(j=0,i=19;j<20,i>=0;j++,i--){
            cout<<"N["<<j<<"] = "<<a[i]<<endl;
    }

    return 0;
}
