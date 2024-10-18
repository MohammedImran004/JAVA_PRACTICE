import java.util.*;
public class StringWithPreservingPositionOfSpaces{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = "work while you work";
        String d=s;
        int c=0;
        char[] org=d.toCharArray();
        for(int i=s.length()-1;i>=0;i--)
        {
            if(org[c]>=32 && org[c]<=47) 
            {
                System.out.print(org[c]);
                i++;
                c++;
            }
            else
            {
               if(!(org[i]>=32 && org[i]<=47))
               {
               System.out.print(org[i]);
               c++;
               }
            }
            
        }
        
    }
}