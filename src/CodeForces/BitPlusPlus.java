package CodeForces;
import java.util.*;
public class BitPlusPlus {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(),X=0,i;
        String st[] = new String[n];
        for(i=0;i<n;i++){
            String str = s.next();
            st[i] = str;
        }
        for(i=0;i<n;i++){    
            if(st[i].equals("++X") || st[i].equals("X++"))
                X++;
            else
                X--;
        }
        System.out.println(X);
    }
}
