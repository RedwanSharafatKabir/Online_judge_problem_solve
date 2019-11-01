package CodeForces;
import java.util.Scanner;
public class Drinks {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt(), i;
        double result = 0, sum = 0;
        
        for(i=1;i<=n;i++){
            result = s.nextInt();
            sum+=result;
        }
        System.out.printf("%.12f", (sum/(n*100))*100);
        System.out.println("");
    }
}
