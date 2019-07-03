package Hacker_Rank_Problems;
import java.util.*;
public class operators {
    
    static void solve(double meal_cost, int tip_percent, int tax_percent){
        double result1 = (meal_cost+((meal_cost*tip_percent)/100)+((meal_cost*tax_percent)/100));
        int result2 = (int)(meal_cost+((meal_cost*tip_percent)/100)+((meal_cost*tax_percent)/100));
        if((result1-result2)>=0.5)
            System.out.println("The total meal cost is "+(result2+1)+" dollars.");
        else
            System.out.println("The total meal cost is "+result2+" dollars.");
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();
        
        solve(meal_cost, tip_percent, tax_percent);
        
        scanner.close();
    }
}
