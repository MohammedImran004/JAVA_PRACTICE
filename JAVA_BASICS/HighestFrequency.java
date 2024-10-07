import java.util.*;
public class HighestFrequency{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[] = s.split(" ");
        int c = 0,max=0,ix=0 ;

        for(int i = 0; i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i].equals(str[j]))
                {
                    c++;
                }
            }
            if(c>max)
            {
                max=c;
                ix=i;
            }
            c=0;
        }
        if(max==0)
        {
            System.out.print("None");
        }
        else
        {
            
        System.out.print(str[ix]);
        }
    }
}