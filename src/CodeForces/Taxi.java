package CodeForces;
import java.util.*;
public class taxi {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(),i,x[]=new int [100];
        for(i=0;i<n;i++){
            x[i]=s.nextInt();
        }
        for(i=1;i<n;i++){
            x[0]+=x[i];
        }
        int result = x[0] / 4;
        if(x[0]%4 != 0){
            result++;
        }
        System.out.println(result);
    }
}
