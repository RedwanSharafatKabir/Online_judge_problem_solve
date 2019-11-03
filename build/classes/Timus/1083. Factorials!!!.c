#include<stdio.h>
int main()
{
    char k[100];
    int n,i,c,f=1;
    scanf("%d",&n);
    while(gets(k)){
       for(i=0;i<strlen(k);i++){
        if(k[i]=='!')
           c++;
        else if(k[i]=='\n')
            break ;
       }
    }
    if(n%c!=0){
        for(i=1;i<=n;i+=c){
            f*=i;
        }
    }
    printf("%d\n",f);
    return 0;
}
