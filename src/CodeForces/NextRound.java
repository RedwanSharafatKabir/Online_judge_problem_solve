package CodeForces;
import java.util.*;
public class NextRound {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),k = s.nextInt();
        int [] a = new int[100];
        int count = 0,x = 0;
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
            if((i+1)==k)
                x=a[i];
        }
        for(int i=0;i<n;i++){
            if(a[i]>=x && a[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
