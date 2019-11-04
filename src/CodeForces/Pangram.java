package CodeForces;
import java.util.*;
public class Pangram {
    public static boolean testString (String st, int n){
        boolean []test = new boolean[26];
        char []ch = st.toCharArray();
        int temp = 0, i;
        
        for(i=0; i<st.length(); i++){
            if(Character.isUpperCase(ch[i])){
                temp = ch[i] - 'A';
            }
            else if(Character.isLowerCase(ch[i])){
                temp = ch[i] - 'a';
            }
            
            test[temp] = true;
        }
        for(i=0; i<=25; i++){
            if(test[i]==false){
                return (false);
            }
        }
        return (true);
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String st = s.next();
        
        if(testString(st, n)==true){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
