
public class WrapperClass {
    public static void main(String[] args) {
        int num = 10;
        // Converting primitive int to Integer object
        Integer numObj = Integer.valueOf(num);
        // Converting Integer object back to primitive int
        int numPrimitive = numObj.intValue();
        // Printing the values
        System.out.println("Primitive int: " + num);
        System.out.println("Integer object: " + numObj);

        String str ="1250";
        int num1 = Integer.parseInt(str);
        // Converting String to int using parseInt method
        System.out.println("String to int: " + num1*10);
       
    }
    
}
