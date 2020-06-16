package Toph;
import java.text.DecimalFormat;
import java.util.*;
public class Cone_inside_Cylinder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double V, P, r, h, result;
        V = s.nextDouble();
        P = s.nextDouble();
        
        r = P/(2*Math.PI);
        h = (3*V)/(2*Math.PI*(r*r));
        result = (h/3)*Math.PI*(r*r);
       
        System.out.println(String.format("%.4f", result));
    }
}
