import java.util.*;
public class PossibleLetterCombinations{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem=0,start,end,rev=0,len=0,e=1;
        while(n>0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
            len++;
            
        }
        char let [] = new char[len*3];
        n = rev;
        len=0;
        while(n>0)
        {
            rem=n%10;
            n/=10;
            start=(rem-2)*3;
            end=(rem-1)*3;
            for(int  i = start ; i < end ; i ++)
            {
                char temp = (char) ('a' + i) ;
                let[len]=temp;
                len++;
            }
        }
        if(rev==1)
        {
          System.out.print("No Combination of Strings");
        }
        else if(let.length == 3 )
        {
          for( int i=0;i<let.length;i++)
          {
            System.out.print(let[i]+" ");
          }
        }
        for( int i=0;i<let.length;i++)
        {
            for(int j =3*e;j<let.length;j++)
            {
            System.out.print(let[i]);
            System.out.print(let[j]+" ");
            }
            if((i+1)%3==0)
            {
              e++;
            }
        }
    }
}
