package CodeForces;
import java.util.*;
public class Football {
    public static void main(String args[]){
        Football obj = new Football();
        Scanner s = new Scanner(System.in);
        int i,count=1;
        String st = s.next();
        
        for(i=1;i<st.length();i++){
            if(st.charAt(i) == st.charAt(i-1)){
                count++;
                if(count==7){
                    System.out.println("YES");
                    return;
                }
            }
            else{
                count=1;
            }
        }
        System.out.println("NO");
    }
}
