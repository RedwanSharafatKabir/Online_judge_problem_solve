package CodeForces;
import java.util.*;
public class Soldier_Bananas {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt(),i, result=0;
        
        for(i=1;i<=c;i++){
            result = result + (a*i);
        }
        if((result-b)>=0){
            System.out.println(result-b);
        }
        else if((result-b)<0){
            System.out.println(0);
        }
    }
}
