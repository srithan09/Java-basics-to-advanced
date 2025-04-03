import tools.Calc;
import tools.AdvCalc;
public class Demo {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int sum = calc.add(5, 3);
        int difference = calc.subtract(5, 3);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        AdvCalc advCalc = new AdvCalc();
        int product = advCalc.multiply(100, 909);
        int quotient = advCalc.divide(5, 3);
        int power = advCalc.power(5, 3);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        
    }
    
}
