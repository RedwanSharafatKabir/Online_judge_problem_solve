#include<stdio.h>
#include<iostream>
using namespace std;

int main()
{
    double A,B,C;
    cin>>A>>B>>C;

    if(A>=B&&A>=C){
       if(A>=B+C){cout<<"NAO FORMA TRIANGULO"<<endl;}
       else if(A*A>B*B+C*C)
        {cout<<"TRIANGULO OBTUSANGULO"<<endl;}

       if(A*A==B*B+C*C){cout<<"TRIANGULO RETANGULO"<<endl;}

       if(A*A<B*B+C*C){cout<<"TRIANGULO ACUTANGULO"<<endl;}

       if(A==B && B==C && A==C){cout<<"TRIANGULO EQUILATERO"<<endl;}

       if((A==B&&A!=C)||(B==C&&B!=A)||(A==C&&A!=B)){cout<<"TRIANGULO ISOSCELES"<<endl;}

    }
    else if(B>=A&&B>=C){
       if(B>=A+C){cout<<"NAO FORMA TRIANGULO"<<endl;}
       else if(B*B>A*A+C*C)
        {cout<<"TRIANGULO OBTUSANGULO"<<endl;}

       if(B*B==A*A+C*C){cout<<"TRIANGULO RETANGULO"<<endl;}

       if(B*B<A*A+C*C){cout<<"TRIANGULO ACUTANGULO"<<endl;}

       if(A==B && B==C && A==C){cout<<"TRIANGULO EQUILATERO"<<endl;}

       if((A==B&&A!=C)||(B==C&&B!=A)||(A==C&&A!=B)){cout<<"TRIANGULO ISOSCELES"<<endl;}


    }
    else if(C>=A&&C>=B){
       if(C>=B+C){cout<<"NAO FORMA TRIANGULO"<<endl;}
       else if(C*C>A*A+B*B)
        {cout<<"TRIANGULO OBTUSANGULO"<<endl;}

       if(C*C==A*A+B*B){cout<<"TRIANGULO RETANGULO"<<endl;}

       if(C*C<A*A+B*B){cout<<"TRIANGULO ACUTANGULO"<<endl;}

       if(A==B && B==C && A==C){cout<<"TRIANGULO EQUILATERO"<<endl;}

       if((A==B&&A!=C)||(B==C&&B!=A)||(A==C&&A!=B)){cout<<"TRIANGULO ISOSCELES"<<endl;}

    }
    return 0;
}

