package CodeForces;
import java.util.*;
public class Anton_and_Letters {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        StringBuffer obj = new StringBuffer();
        String st1 = s.nextLine();
        int count1 = 0, FinalLength;
        
        for(int i=0;i<st1.length();i++){
            if(Character.isLetter(st1.charAt(i))){
                count1++;
            }
        }
        FinalLength = count1;
        char ch2[] = new char[st1.length()];
        
        for(int i=0;i<st1.length();i++){
            if(Character.isLetter(st1.charAt(i))){
                ch2[i] = st1.charAt(i);
            }
        }
        String st2 = new String(ch2);
        
        st2.chars().distinct().forEach(ch1->obj.append((char)ch1));
        
        System.out.println(obj.toString().length() - 1);
    }
}
