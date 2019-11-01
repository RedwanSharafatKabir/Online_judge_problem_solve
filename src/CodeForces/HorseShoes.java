package CodeForces;
import java.util.*;
public class HorseShoes {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int ar[] = new int [4], result, count = 0, i;
        
        for(i=0; i<4; i++){
            ar[i] = s.nextInt();
        }
        
        Arrays.sort(ar);
        
        for(i=1; i<4; i++){
            if(ar[i]==ar[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
