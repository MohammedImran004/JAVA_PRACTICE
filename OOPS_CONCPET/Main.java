import java.util.*;
class Calculator{
    public static int powerInt(int num1,int num2)
    {
        return (int) Math.pow(num1,num2);
    }
    public static double powerDouble(double num1,double num2)
    {
        return Math.pow(num1,num2);
    }
}
public class Main{
    public static void main(String args[])
    {
        // Calculator obj= new Calculator();
        Scanner sc=new Scanner(System.in);
        int nI=sc.nextInt();
        int mI=sc.nextInt();
        float nF=sc.nextFloat();
        float mF=sc.nextFloat();
        int resultInt = Calculator.powerInt(nI,mI);
        double resultDouble = Calculator.powerDouble(nF,mF);
        System.out.println(resultInt);
        System.out.println(resultDouble);
        
    }
}