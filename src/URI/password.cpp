#include <iostream>
using namespace std;
int main()
{
    int i,N;
    while(1)
    {
        cin>>N;
        if(N>=1001 && N<9999)
            cout<<N-1<<endl;
        else if(N==9999){
                cout<<N-1<<endl;
                break ;
        }
    }

    return 0;
}
