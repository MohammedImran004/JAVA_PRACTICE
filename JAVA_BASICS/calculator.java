
 import java.util.Scanner;
 public class calculator{
    public static void main(String args[])
    {
        char a;
        int b,c;
        Scanner sc = new Scanner(System.in);
        a=sc.next().charAt(0);
        b=sc.nextInt();
        c=sc.nextInt();
        switch(a)
        {
            case '+':
            b=b+c;
            System.out.println(b);
            break;
            case '-':
            b=b-c;
            System.out.println(b);
            break;
            case '*':
            b=b*c;
            System.out.println(b);
            break;
            case  '/':
            b=b/c;
            System.out.println(b);
            break;
        }
    }
    
}

