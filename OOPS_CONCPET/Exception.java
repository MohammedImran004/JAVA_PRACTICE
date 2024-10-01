import java.util.*;
public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        try {
            if (c > 10) 
            throw new ArrayIndexOutOfBoundsException("Greater than 10");
            else
            {
                System.out.println(c*10);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
