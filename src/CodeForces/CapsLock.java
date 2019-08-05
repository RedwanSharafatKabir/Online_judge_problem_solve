package CodeForces;
import java.util.*;
public class CapsLock {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        String st = s.next();
        char ch[] = st.toCharArray();
        int i;
        if(st.length()==1) {
            for(i=0;i<st.length();i++){
                if(Character.isLowerCase(st.charAt(i))){
                    System.out.println(Character.toUpperCase(st.charAt(i)));
                }
                else
                    System.out.println(Character.toLowerCase(st.charAt(i)));
            }
        }
        
        else if(Character.isLowerCase(st.charAt(0))){
            for(i=1;i<st.length();i++){
                if(Character.isLowerCase(st.charAt(i))){
                    if(Character.isLowerCase(st.charAt(i))){
                        for(i=0;i<st.length();i++){
                            System.out.print(ch[i]);
                        }
                        System.out.println();
                        return;
                    }
                }
            }
            for(i=1;i<st.length();i++){
                ch[0] = Character.toUpperCase(st.charAt(0));
                ch[i] = Character.toLowerCase(st.charAt(i));
            }
            for(i=0;i<st.length();i++){
                System.out.print(ch[i]);
            }
            System.out.println();
            return;
        }
        
        else if(Character.isUpperCase(st.charAt(0))){
            for(i=1;i<st.length();i++){
                if(Character.isLowerCase(st.charAt(i))){
                    for(i=0;i<st.length();i++){
                        System.out.print(ch[i]);
                    }
                    System.out.println();
                    return;
                }
            }
            for(i=1;i<st.length();i++){
                ch[0] = Character.toLowerCase(st.charAt(0));
                ch[i] = Character.toLowerCase(st.charAt(i));
            }
            for(i=0;i<st.length();i++){
                System.out.print(ch[i]);
            }
            System.out.println();
            return;
        }
    }
}
