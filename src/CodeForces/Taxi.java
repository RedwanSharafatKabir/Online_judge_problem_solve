package CodeForces;
import java.util.*;
public class Taxi {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(),i,max,temp=0,four=0,one=0,two=0,three=0;
        int ar[] = new int [100];
        for(i=0;i<n;i++){
            ar[i]=s.nextInt();
        }
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ar[i]<ar[j]){
                    max=ar[j];
                    ar[j]=ar[i];
                    ar[i]=max;
                }
            }
        }
        
        for(i=1;i<n;i++){
            if(ar[i]==ar[i-1]){
                if(ar[i]==2){
                    two++;
                    if(two==1){
                        temp++;
                    }
                }
                else if(ar[i]==1){
                    one++;
                    if(one==3){
                        temp++;
                    }
                    else if(one<3){
                        
                    }
                }
            }
        }
        
    }
}
