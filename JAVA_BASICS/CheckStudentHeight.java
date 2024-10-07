import java.util.*;
public class CheckStudentHeight{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int as[] = new int[n];
        int chk[] = new int[n];
        int c=0;
        for(int i = 0 ; i < n ; i++)
        {
            as[i]=sc.nextInt();
            chk[i]=as[i];
        }
        Arrays.sort(as);
        for(int i = 0 ; i< n ;i ++)
        {
            if(as[i] != chk[i])
            {
                c++;
            }
        }
        System.out.print(c);
    }
}