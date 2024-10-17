import java.util.*;
public class Rotation{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            String s = sc.next();
            char d[]=s.toCharArray();
            int k=sc.nextInt();
            char temp='0';
            for(int ie=0;ie<k;ie++)
            {
                temp  = d[s.length()-1];
                for(int j=s.length()-1;j>0;j--)
                {
                    d[j]=d[j-1];
                }
                d[0]= temp;
            }
            for(int j=0;j<d.length;j++)
            {
                System.out.print(d[j]);
            }
            char temp='0';
            for(int ie=0;ie<k;ie++)
            {
                temp  = d[s.length()-1];
                for(int j=s.length()-1;j>0;j--)
                {
                    d[j]=d[j-1];
                }
                d[0]= temp;
            }
            for(int j=0;j<d.length;j++)
            {
                System.out.print(d[j]);
            }
           
        }
    }
}