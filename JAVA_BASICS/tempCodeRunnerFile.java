import java.util.*;
public class rem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str = Double.toString((double)n/m);
        String s[] = str.split("\\.");
        String c ="";
        boolean found=false;
        for(int i = 0; i < s[1].length() ; i++)
        {
            c+=s[1].charAt(i);
            for(int j = i+1; j < s[1].length() ; j++)
            {
            if(s[1].charAt(i)==s[1].charAt(j))
            {
                found=true;
                break;
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