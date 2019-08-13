package CodeForces;
import java.util.*;
public class BeautifulYear {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), a, b, c, d;
        
        while(true){
            n+=1;
            a = n/1000;
            b = (n%1000)/100;
//            b = (n/100)%10;
            c = ((n%1000)%100)/10;
//            c = (n/10)%10;
            d = ((n%1000)%100)%10;
//            d = n%10;
            if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
                break;
            }
        }
        System.out.println(n);
    }
}
