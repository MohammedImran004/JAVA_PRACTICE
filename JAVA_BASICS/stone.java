import java.util.*;
public class stone{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String j = sc.next();
        String s = sc.next();
        int c=0;
        char J[]=j.toCharArray();
        char S[]=s.toCharArray();
        for(int i=0;i<j.length();i++)
        {
            for(int k=0;k<s.length();k++)
            {
                if(J[i]==S[k])
                {
                c++;
                S[k]='0';
                }
            }
        }
        System.out.println(c);
    }
}