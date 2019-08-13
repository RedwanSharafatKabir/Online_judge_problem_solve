package CodeForces;
import java.util.*;
public class Presents {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), ar[] = new int [n], count = 0;
        for(int i=0;i<n;i++){
            ar[i] = s.nextInt();
        }
        
        for(int j=1;j<=n;j++){
            for(int i=0;i<n;i++){
                if(ar[i] == j){
                    System.out.print((i+1) + " ");
                }
            }
        }
        System.out.println("");
    }
}
