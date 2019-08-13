package CodeForces;
import java.util.*;
public class Elephant {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%5 == 0){
            System.out.println(n/5);
        }
        else if(n%5 != 0){
            System.out.println((n/5)+1);
        }
    }
}
