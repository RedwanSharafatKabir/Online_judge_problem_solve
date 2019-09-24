package URI;
import java.util.*;
public class Parenthesis_Balance_I {
    public String check(int i, String st){
        int j, count1 = 0, count2 = 0;
        char ch[] = st.toCharArray();
        
        for(j=i;j<st.length();j++){
//        for(j=0;j<st.length();j++){
            if(ch[j]=='('){
                count1++;
            }
            else if(ch[j]==')'){
                count2++;
            }
        }
//        System.out.println(count1+" "+count2);
        
        if(count1!=count2){
            return "incorrect";
            
        }
        else {
            return "correct";
        }
    }
    
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        Parenthesis_Balance_I obj = new Parenthesis_Balance_I();
        
        String st = s.next();
        char ch[] = st.toCharArray();
        int i;
        
        for(i=0;i<st.length();i++){
            if(ch[i]=='('){
                System.out.println(obj.check(i,st));
                System.exit(0);
            }
        }
    }
}
