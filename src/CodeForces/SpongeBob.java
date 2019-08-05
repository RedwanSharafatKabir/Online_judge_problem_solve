package CodeForces;
import java.util.*;
public class SpongeBob {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int i, n = s.nextInt(),a,b;
        
        for(i=0;i<n;i++){
            a = s.nextInt();
            b = s.nextInt();
            if(a==b)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        
    }
}
