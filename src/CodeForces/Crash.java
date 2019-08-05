package CodeForces;
import java.util.*;
public class Crash {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int i;
        String st1 = s.next();
        String st2 = s.next();
        String st3 = s.next();
        char ch[] = st2.toCharArray();
        char ch1[] = st1.toCharArray();
        char ch3[] = st3.toCharArray();
        
        for(i=0;i<st1.length();i++){
            if(ch1[i] == '='){
                for(int k=i+1;k<10;k++){
                    if(ch1[k] == 'H'){
                        System.out.println("H");
                        return;
                    }
                    else if(ch1[k] == 'T'){
                        System.out.println("T");
                        return;
                    }
                    else if(ch1[k] == 'P'){
                        System.out.println("P");
                        return;
                    }
                }
            System.out.println("You shall pass!!!");
            return;
            }
        }
        
        for(i=0;i<st2.length();i++){
            if(ch[i] == '='){
                for(int k=i+1;k<10;k++){
                    if(ch[k] == 'H'){
                        System.out.println("H");
                        return;
                    }
                    else if(ch[k] == 'T'){
                        System.out.println("T");
                        return;
                    }
                    else if(ch[k] == 'P'){
                        System.out.println("P");
                        return;
                    }
                }
            System.out.println("You shall pass!!!");
            return;
            }
        }
        
        for(i=0;i<st3.length();i++){
            if(ch3[i] == '='){
                for(int k=i+1;k<10;k++){
                    if(ch3[k] == 'H'){
                        System.out.println("H");
                        return;
                    }
                    else if(ch3[k] == 'T'){
                        System.out.println("T");
                        return;
                    }
                    else if(ch3[k] == 'P'){
                        System.out.println("P");
                        return;
                    }
                }
            System.out.println("You shall pass!!!");
            return;
            }
        }
    }
}
