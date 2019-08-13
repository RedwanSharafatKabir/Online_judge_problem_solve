#include<stdio.h>
int main()
{
    int z[100],a,b,c=0,i,x,y,sum,carry=0;
    while(scanf("%d%d",&a,&b)!=EOF){
    if(a==0&&b==0)
        return 0;
    for(i=0;a+b+c!=0;i++,a/=10,b/=10){
    x=a%10;
    y=b%10;
    sum=x+y+c;
    c=sum/10;
    if(c==1)
        carry++;
    }
    if(carry==0){
        printf("No carry operation.\n");
        carry=0;
    }
    else{
        if(carry==1){
            printf("%d carry operation.\n",carry);
            carry=0;
        }
        else{
            printf("%d carry operations.\n",carry);
            carry=0;
        }
    }
    }
    return 0;
}
