package CodeForces;
import java.util.*;
public class Petya_Strings {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str1 = s.next(),str2 = s.next(),S1,S2;
        int i,n=0;
        S1 = str1.toLowerCase();
        S2 = str2.toLowerCase();
        for(i=0;i<S1.length();i++){
            if(S2.charAt(i) == S1.charAt(i)){
                continue;
            }
            else if(S1.charAt(i) > S2.charAt(i)){
                n = 1;
                break;
            }
            else if(S2.charAt(i) > S1.charAt(i)){
                n = -1;
                break;
            }
        }
        System.out.println(n);
    }
}
