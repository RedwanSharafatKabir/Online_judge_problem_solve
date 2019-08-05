package CodeForces;
import java.util.*;
public class GeorgeAlex {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int ar[][] = new int [1000][1000];
        int i, n = s.nextInt(), j, count = 0;
        for(i=0;i<n;i++){
            for(j=0;j<2;j++)
                ar[i][j] = s.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<2;j++){
                if((ar[i][j+1]-ar[i][j]) >= 2){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
