import java.util.*;
public class excel{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            l=(26*l)+(s.charAt(i)- 'A' +1);
        }
        System.out.print(l);
    }
}