#include<iostream>
using namespace std;
int main()
{
    int i,cnt=0,jump=0;
    char s[105];
    cin>>s;
    for(i=0; s[i]; i++)
    {
        if(!(s[i]=='A'||s[i]=='E'||s[i]=='I'||s[i]=='O'||s[i]=='U'||s[i]=='Y'))
        {
            cnt++;
            if(cnt>jump)
                jump=cnt;
        }
        else
        {
            cnt=0;
        }
    }
    cout<<jump+1<<endl;
    return 0;
}
