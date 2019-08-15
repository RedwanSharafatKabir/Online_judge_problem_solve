package CodeForces;
import java.util.Scanner;
public class vanya_fence {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        int ar[] = new int [a], i, count = 0, x = 0;
        
        for(i=0;i<a;i++){
            ar[i] = s.nextInt();
        }
        
        for(i=0;i<a;i++){
            if(ar[i]<=b){
                count++;
            }
            else {
                x+=2;
            }
        }
        System.out.println(count + x);
    }
}
