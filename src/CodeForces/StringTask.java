package CodeForces;
import java.util.*;
public class StringTask {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        String st = s.next(),vowels = "aeiouyAEIOUY";
        char ch[] = st.toCharArray();
        int L = st.length();
        for(int i=0;i<L;i++){
            if(vowels.indexOf(st.charAt(i))>=0){
                ch[i] = 0;
            }
        }
        for(int i=0;i<L;i++){
            if(vowels.indexOf(st.charAt(i))<0 && Character.isLetter(st.charAt(i))){
                System.out.print("."+Character.toLowerCase(st.charAt(i)));
            }
        }
        System.out.println();
    }
}
