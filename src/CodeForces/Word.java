package CodeForces;
import java.util.*;
public class Word {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        String st = s.next();
        int i, count1 = 0, count2 = 0;
        char ch[] = st.toCharArray();
        for(i=0;i<st.length();i++){
            if(Character.isUpperCase(st.charAt(i))){
                count1++;
            }
            else if(Character.isLowerCase(st.charAt(i))){
                count2++;
            }
        }
        if(count1<count2){
            System.out.println(st.toLowerCase());
        }
        else if(count2<count1){
            System.out.println(st.toUpperCase());
        }
        else if(count1 == count2){
            System.out.println(st.toLowerCase());
        }
    }
}
