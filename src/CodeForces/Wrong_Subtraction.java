package CodeForces;
import java.util.*;
public class Wrong_Subtraction {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i, k = s.nextInt();
        
        for(i=0;i<k;i++){
            if(n%10 != 0){
                n--;
            }
            else if(n%10 == 0){
                n/=10;
            }
        }
        System.out.println(n);
    }
}
