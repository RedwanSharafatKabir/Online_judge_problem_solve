package CodeForces;
import java.util.*;
public class Games {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int i, n = s.nextInt(), a, b, count = 0;
        int ar1[] = new int[n], ar2[] = new int[n];
        
        for(i=0;i<n;i++){
            a = s.nextInt();
            b = s.nextInt();
            ar1[i] = a;
            ar2[i] = b;
        }
        
        for(i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ar1[i] == ar2[j]){
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
