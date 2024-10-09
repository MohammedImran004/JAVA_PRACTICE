
import java.util.*;
public class power{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result =1;
        for(int i=0;i<n;i++)
        {
            result = (result * m);
        }
        System.out.print(result%10);
    }
}