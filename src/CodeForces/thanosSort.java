package CodeForces;
import java.util.*;
public class thanosSort {
    
    public static boolean isSorted(int ar[]){
        int i,j,k;
        for (i=0; i<(ar.length-1); i++) {
            if (ar[i] > ar[i+1]) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), ar[] = new int [n], temp, i, j;
        for(i=0;i<n;i++){
            ar[i] = s.nextInt();
        }
        if(isSorted(ar)){
            System.out.println(ar.length);
        }
    }
}
