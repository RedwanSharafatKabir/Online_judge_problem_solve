package CodeForces;
import java.util.*;
public class expression{
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        long a, b, c, result;
        Long ar[] = new Long [1000000];
        int i;
        
        a = s.nextLong();
        b = s.nextLong();
        c = s.nextLong();
        
        ar[0] = a+b*c;
        ar[1] = a*b+c;
        ar[2] = a*b*c;
        ar[3] = a+b+c;
        ar[4] = (a+b)*c;
        ar[5] = a*(b+c);
        
        result = ar[0];
        for(i=0;i<6;i++){
            if(result<ar[i]){
                result = ar[i];
            }
        }
        System.out.println(result);
    }
}
