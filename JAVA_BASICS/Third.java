import java.util.*;
public class Third{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String first = sc.next();
        String sec = sc.next();
        String str[] = s.split(" ");
        String thi[] = new String[str.length];
        int c = 0;
        for(int i = 0 ; i < str.length ; i++)
        {
            if(str[i].equals(first) && str[i+1].equals(sec))
            {
                thi[c]=str[i+2];
                c++;
            }
        }
        for(int i=0;i<c;i++)
        {
            System.out.println(thi[i]);
        }
    }
}