#include<iostream>
using namespace std;

int main()
{
    int i,n,x=0,y=0,A[100000];
    cin>>n;
    for(i=0;i<n;i++){
        cin>>A[i];
    }
    for(i=0;i<n;i++){
    if(A[i]%2==0&&A[i]<0)
       cout<<"EVEN NEGATIVE\n";
    if(A[i]%2==0&&A[i]>0)
       cout<<"EVEN POSITIVE\n";
    if(A[i]%2!=0&&A[i]<0)
       cout<<"ODD NEGATIVE\n";
    if(A[i]%2!=0&&A[i]>0)
       cout<<"ODD POSITIVE\n";
    if(A[i]==0)
       cout<<"NULL\n";
    }
    return 0;
}
