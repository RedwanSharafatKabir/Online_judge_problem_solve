package CodeForces;
import java.util.*;
public class HelpfulMaths {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int i,j;
        String st = s.next();
        char ch[] = st.toCharArray(),c;
        int L = st.length();
        for(i=0;i<L;i++){
            for(j=i+1;j<L;j++){
                if(Character.isDigit(ch[i]) && Character.isDigit(ch[j]) && ch[i] > ch[j]){
                    c = ch[i];
                    ch[i] = ch[j];
                    ch[j] = c;
                }
            }
        }
        for(i=0;i<L;i++){
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
