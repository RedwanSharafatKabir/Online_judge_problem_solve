#include<iostream>
#include<stdio.h>
#include<math.h>
using namespace std;

int main()
{
    int temp,rev,r,c,count1,i,j,n;
    while(cin>>n){
        c=0;
        temp=n;
        for(i=2;i<=sqrt(n);i++){
            if(n%i==0){
                c=1;
                break;
            }
        }
        if(c==0){
            rev=0;
            count1=0;
            while(n){
                r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
            for(j=2;j<=sqrt(rev);j++)
            {
                if(rev%j==0)
                {
                    count1=1;
                    break;
                }
            }
            if(count1==0 && temp!=rev)
            {
                cout<<temp<<" is emirp."<<endl;
            }
            else
               cout<<temp<<" is prime."<<endl;
        }
        else
            cout<<temp<<" is not prime."<<endl;
    }
    return 0;
}
