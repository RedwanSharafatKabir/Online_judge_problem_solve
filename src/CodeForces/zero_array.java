package CodeForces;
import java.util.*;
public class zero_array {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(), i, count=0, ar[]=new int [1000];
        for(i=0;i<n;i++){
            ar[i] = s.nextInt();
        }
        if(n%2==0){
            for(i=0;i<n;i+=2){
                if(ar[i]==ar[i+1]){
                    count++;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
            if(count==(n/2)){
                System.out.println("YES");
            }
        }
        else if(n%2!=0){
            for(i=0;i<n-1;i+=2){
                if(ar[i]==ar[i+1]){
                    count++;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
            if(count==((n-1)/2)){
                System.out.println("YES");
            }
        }
    }
}
