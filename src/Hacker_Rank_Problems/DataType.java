package Hacker_Rank_Problems;
import java.util.*;
public class DataType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i=4,j=scan.nextInt();
        double d=4.0,e=scan.nextDouble();
        scan.nextLine();
        String s1 = "HackerRank ",s2=scan.nextLine();
        
        System.out.println(i+j);
        System.out.println((d+e));
        System.out.println(s1.concat(s2));
        scan.close();
    }
}
