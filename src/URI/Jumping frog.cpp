#include <bits/stdc++.h>
using namespace std;

int p,N,n[100];
int main(){
	scanf("%d%d",&p,&N);
	scanf("%d",&n[0]);
	for(int i=1; i<N; i++){
		scanf("%d",&n[i]);
		if(abs(n[i]-n[i-1]) > p){
			printf("GAME OVER\n");
			return 0;
		}
	}
	printf("YOU WIN\n");
	return 0;
}
