package tools;
public class AdvCalc extends Calc {
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }
    public int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
}
