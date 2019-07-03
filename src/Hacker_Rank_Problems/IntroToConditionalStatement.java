package Hacker_Rank_Problems;
import java.util.*;
public class IntroToConditionalStatement {
    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N = s.nextInt();
        if(N%2==1)
            System.out.println("Weird");
        else if((N%2==0) && (N>=2&&N<=5))
            System.out.println("Not Weird");
        else if((N%2==0) && (N>=6&&N<=20))
            System.out.println("Weird");
        else if((N%2==0) && (N>20))
            System.out.println("Not Weird");

        s.close();
    }
}
