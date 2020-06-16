package Toph;
import java.util.*;
public class Roll_it_Monu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int N, M, a=1, b=2;
        N = s.nextInt();
        M = s.nextInt();
        
        if(M==1){
           if(N==6||N==5||N==4||N==2){
               System.out.println(a);
           }
           else {
               System.out.println(b);
           }
        }
        else if(M==2){
           if(N==6||N==5||N==1||N==3){
               System.out.println(a);
           }
           else {
               System.out.println(b);
           }
        }
        else if(M==3){
           if(N==6||N==5||N==4||N==2){
               System.out.println(a);
           }
           else {
               System.out.println(b);
           }
        }
        else if(M==4){
           if(N==6||N==5||N==3||N==1){
               System.out.println(a);
           }
           else {
               System.out.println(b);
           }
        }
        else if(M==5){
           if(N==1||N==3||N==4||N==2){
               System.out.println(a);
           }
           else {
               System.out.println(b);
           }
        }
        else if(M==6){
           if(N==4||N==3||N==1||N==2){
               System.out.println(a);
           }
           else {
               System.out.println(b);
           }
        }
    }
}
