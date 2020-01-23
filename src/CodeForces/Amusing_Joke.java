package CodeForces;
import java.util.*;
public class Amusing_Joke {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        
        String str1 = s.next(), str2 = s.next(), str3 = s.next();
        String result = str1 + str2;
        
        if(result.length()==str3.length()){
            boolean test = false;
            for(char ch = 'A'; ch<='Z'; ch++){
                if(result.contains(String.valueOf(ch))){
                    result = result.replaceAll(String.valueOf(ch), "");
                    int a = result.length();
                    str3 = str3.replaceAll(String.valueOf(ch), "");
                    int b = str3.length();
                    
                    if(a!=b){
                        test = true;
                        break;
                    }
                }
            }
            if(!test){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
        else {
            System.out.println("NO");
        }
    }
}
