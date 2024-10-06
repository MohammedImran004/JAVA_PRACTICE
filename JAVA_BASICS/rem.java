import java.util.*;
public class rem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = Double.toString((double)n/m);
        String s[] = str.split("\\.");
        String c ="";
        int l = s[1].length();
        boolean found=false;
        for(int i = 0; i < s[1].length() ; i++)
        {
            c+=s[1].charAt(i);
            for(int j = i+1; j < s[1].length() ; j++)
            {
            if(s[1].charAt(i)==s[1].charAt(j))
            {
                if(c.length()>1 ) 
                {
                  if(c.charAt(1)==s[1].charAt(j+1))
                  {
                  System.out.print(c.charAt(1)+" "+s[1].charAt(j));
                  found=true;
                  break;
                  }
                }
                else
                {
                if(l >= 2 && 
                ((s[1].charAt(l - 1) == c.charAt(0) || s[1].charAt(l - 1) == c.charAt(0) + 1) &&
                (s[1].charAt(l - 2) == c.charAt(0))))
                  {
                  found=true;
                  break;
                  }
                }
            }
            else
            {
                c+=s[1].charAt(j);
            }
            }
            if(found)
            {
                break;
            }
            c="";
        }
        System.out.println(c);
    }
}