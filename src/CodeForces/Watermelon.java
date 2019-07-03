package CodeForces;
import java.util.*;
public class Watermelon {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        if(((x%2)==0 && x>2)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
