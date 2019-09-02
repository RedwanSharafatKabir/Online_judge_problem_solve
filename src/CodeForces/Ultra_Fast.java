package CodeForces;
import java.util.*;

public class Ultra_Fast {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        String st1 = s.next(), st2 = s.next();
        char ch1[] = st1.toCharArray(), ch2[] = st2.toCharArray();
        int i;
        
        for(i=0;i<st1.length();i++){
            if(ch1[i] == ch2[i]){
                System.out.print(0);
            }
            else {
                System.out.print(1);
            }
        }
        System.out.println();
    }
}
