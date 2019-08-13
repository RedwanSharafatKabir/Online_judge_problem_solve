package CodeForces;
import java.util.*;
public class Insomnia {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int k, l, m, n, d;
        k  = s.nextInt();
        l = s.nextInt();
        m = s.nextInt();
        n = s.nextInt();
        d = s.nextInt();
        int count = d, i;
        
        if(k==1 || l==1 || m==1 || n==1){
            System.out.println(count);
        }
        else {
            for(i=1;i<=d;i++){
                if(i%k!=0 && i%l!=0 && i%m!=0 && i%n!=0){
                    count--;
                }
            }
            System.out.println(count);
        }
    }
}
