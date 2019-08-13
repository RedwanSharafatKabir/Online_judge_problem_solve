#include<stdio.h>
#include<math.h>
#include <iostream>
using namespace std;

int main()
{
    double A, B, C, m, x1, x2;
    cin>>A>>B>>C;
    m=((B*B)-(4*A*C));
    if(A==0 || m<0)
    {
          cout<<"Impossivel calcular"<<endl;
    }
    else
      {
          x1=(-B+sqrt(m))/(2*A);
          x2=(-B-sqrt(m))/(2*A);
          cout<<"R1 = ";
          printf("%.5lf\n", x1);
          cout<<"R2 = ";
          printf("%.5lf\n", x2);
      }

    return 0;
}
