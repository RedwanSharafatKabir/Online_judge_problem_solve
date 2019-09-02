package CodeForces;
import java.util.*;
public class EvenOdd {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong(), k = s.nextLong();
        int i;
        if(k<=((n+1)/2)){
            System.out.println((k*2) -1);
        }
        else {
            System.out.println((k-(n+1)/2)*2);
        }
    }
}
