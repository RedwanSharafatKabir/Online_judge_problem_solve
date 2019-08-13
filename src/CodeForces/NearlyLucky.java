package CodeForces;
import java.util.*;
public class NearlyLucky {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong(), i, count = 0, rem = 0, temp;
        
        while(n!=0){
           rem=n%10;
           temp=n/10;
           n=temp;
           if(rem==4 || rem==7){
               count++;
           }
        }
        
        if(count==4 || count==7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
