package CodeForces;
import java.util.*;
public class YoungPhysicist {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i, a, b, c;
        int result1 = 0, result2 = 0, result3 = 0;
        for(i=1;i<=n;i++){
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
            
            result1 += a;
            result2 += b;
            result3 += c;
        }
       if(result1==0 && result2==0 && result3==0){
            System.out.println("YES");
       }
       else {
           System.out.println("NO");
       }
    }
}
