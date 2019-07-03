package CodeForces;
import java.util.*;
public class StonesOnTheTable {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(),i,j,count=0;
        String st;
        st = s.next();
        char str[] = st.toCharArray();
        for(i=1;i<st.length();i++){
                if(str[i]==str[i-1]){
                    count++;
                }
        }
        System.out.println(count);
    }
}
