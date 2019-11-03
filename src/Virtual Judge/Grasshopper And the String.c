#include<stdio.h>

int main()
{
    int i,j,count1=0,count2=0;
    char a[100];
    gets(a);
    for(i=0;i<strlen(a);i++){
            if(!(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='Y')){
                count1++;
                if(count1>count2)
                    count2 = count1;
            }
            else {
                count1 = 0;
            }
        }
    printf("%d\n",count2+1);
    return 0;
}
