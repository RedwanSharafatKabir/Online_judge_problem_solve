package CodeForces;
import java.util.*;
public class ATheatreSquare {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        double n = s.nextInt(),m = s.nextInt(),a = s.nextInt();
        System.out.println((long)(Math.ceil(n/a) * Math.ceil(m/a)));
    }
}
