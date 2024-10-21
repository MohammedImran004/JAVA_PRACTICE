
import java.util.Scanner;
class vote {
     public static void main(String args[])
    {
        int a;
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        if(a>=18)
        {
            System.out.println("Eligible to vote");
        }
        else
        {
            System.out.println("Not Eligible to vote");
        }
     }
}
