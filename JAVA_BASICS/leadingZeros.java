import java.util.*;
public class leadingZeros{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='0')
            {
                System.out.print(s.substring(i));
                break;
            }
        }
    }
}