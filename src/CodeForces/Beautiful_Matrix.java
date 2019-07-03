package CodeForces;
import java.util.*;
public class Beautiful_Matrix {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int ar[][] = new int[100][100],i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                ar[i][j] = s.nextInt();
                if(ar[i][j]==1){
                    System.out.println(Math.abs(i-3) + Math.abs(j-3));
                }
            }
        }
    }
}
