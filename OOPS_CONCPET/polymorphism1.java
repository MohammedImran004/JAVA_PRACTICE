import java.util.*;

class Product {
 
    // Create a static method Multiply with 2 integer parameters which Returns product of integer numbers
    public static int Multiply(int a, int b) {
        return a * b;
    }

    // Create a static method Multiply with 2 double parameters which Returns product of double numbers
    public static double Multiply(double a, double b) {
        return a * b;
    }
}

public class polymorphism1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
           
        System.out.println(Product.Multiply(num1, num2));
        System.out.println(Product.Multiply(num3, num4));
    }
}

