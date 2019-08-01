package CodeForces;
import java.util.*;
public class BoyOrGirl {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        String st = s.next();
        int temp=0, count1=0, count2=0, result=0, j, i;
        char ch[] = st.toCharArray();
        for(i=0;i<st.length();i++){
            temp++;
            count1=0;
            for(j=i+1;j<st.length();j++){
                if(ch[i] == ch[j]){
                    count1=1;
                }
            }
            count2 = count2 + count1;
        }
        result = temp - count2;
        
        if(result%2 == 0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
