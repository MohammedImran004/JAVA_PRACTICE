import java.util.*;
public class Patient
{
String name;
double height;
double weight;
public double BMI()
{
return (this.weight/(this.height * this.height)) * 703;
}
Patient(String a, double b, double c)
{
this.name = a;
this.height = b;
this.weight = c;
}
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
Patient P = new Patient(input.nextLine(), input.nextDouble(), input.nextDouble());
System.out.println("BMI of " + P.name + " is " + String.format("%.2f", P.BMI()));
}
}