package CodeForces;
import java.util.*;
public class MAGNET {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), i, ar[] = new int [n];
        int count = 0, temp, rem = 0, test;
        for(i=0;i<n;i++){
            ar[i] = s.nextInt();
        }
        
        for(i=1;i<n;i++){
            test = ar[i-1];
            rem = test%10;
            temp = test/10;

            if(rem == (ar[i]/10)){
                count++;
                test = ar[i];
            }
            else
                test = ar[i-1];
        }
        System.out.println(count+1);
    }
}
