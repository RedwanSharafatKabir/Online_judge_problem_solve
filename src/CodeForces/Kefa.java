package CodeForces;
import java.util.*;
public class Kefa {
    
    public static void isSorted(int ar[]){
        int i,count = 0, count2 = 0;
        for (i=0; i<(ar.length-1); i++) {
            if (ar[i] <= ar[i+1]) {
                count++;
                if(count > count2){
                    count2=count;
                }
            }
            else {
                if(count > count2){
                    count2 = count;
                }
                count = 0;
            }
        }
        System.out.println(count2+1);
    }
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), ar[] = new int [n], temp, i, j;
        for(i=0;i<n;i++){
            ar[i] = s.nextInt();
        }
        isSorted(ar);
    }
}
