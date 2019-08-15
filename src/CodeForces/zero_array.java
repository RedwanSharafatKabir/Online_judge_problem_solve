package CodeForces;
import java.util.*;
public class zero_array {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i, index=0;
        long sum1 = 0, sum2 = 0, max;
        Long []ar = new Long [10000000];
        
        for(i=0;i<n;i++){
            ar[i] = s.nextLong();
        }
        for(i=0;i<n;i++){
            sum1+=ar[i];
        }
        
        max = ar[0];
        for(i=1;i<n;i++){
            if(max<ar[i]){
                max = ar[i];
                index = i;
            }
        }
        for(i=0;i<n;i++){
            if(i != index){
                sum2+=ar[i];
            }
        }
        
        if(sum1%2==0 && max<=sum2){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
