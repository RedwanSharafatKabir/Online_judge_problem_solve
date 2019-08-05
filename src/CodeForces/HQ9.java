package CodeForces;
import java.util.*;
public class HQ9 {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        String st = s.nextLine(), jokeLang = "HQ9+";
        int i;
        for(i=0;i<st.length();i++){
            if(jokeLang.indexOf(st.charAt(i)) >= 0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
