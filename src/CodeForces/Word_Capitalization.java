package CodeForces;
import java.util.*;
public class Word_Capitalization {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i;
        String st = s.next();
        char ch[] = st.toCharArray(),c;
        int L = st.length();
        for(i=0;i<L;i++){
            if(Character.isLowerCase(st.charAt(0))){
                System.out.print(Character.toUpperCase(st.charAt(0)));
                break;
            }
            else{
                System.out.print(st.charAt(0));
                break;
            }
        }
        for(i=1;i<L;i++){
            System.out.print(st.charAt(i));
        }
        System.out.println();
    }
}
