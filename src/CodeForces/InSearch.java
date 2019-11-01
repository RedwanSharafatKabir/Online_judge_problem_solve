package CodeForces;
import java.util.*;
public class InSearch{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(), ar[] = new int[100], count = 0;
        
        for(int i=0; i<n; i++){
            ar[i] = s.nextInt();
        }
        
        for(int i=0; i<n; i++){
            if(ar[i]==1){
                count = 1;
                break;
            }
        }
        if(count!=0){
            System.out.println("HARD");
        }
        else {
            System.out.println("EASY");
        }
    }
}
