#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
    int i,A,B;
    double result;
    cin>>A;
    cin>>B;

    result=(B/12.00)*A;

    printf("%.3lf\n",result);
    return 0;
}
