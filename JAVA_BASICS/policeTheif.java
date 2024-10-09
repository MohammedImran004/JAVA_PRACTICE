import java.util.*;
public class policeTheif{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=4;
        int n=2;
        char[][] arr = {{'N','T','N','P'},{'T','N','N','P'},{'N','N','P','T'},{'T','T','P','P'}};
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.next().charAt(0);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            { 
                if(arr[i][j]=='P')
                {
                    for(int l=1;l<=n;l++)
                    {
                        if((j+l)<m)
                        {
                        if(arr[i][j+l]=='T')
                        c++;
                        }
                        else if((j-l)>=0)
                        {
                         if(arr[i][j-l]=='T')
                         c++;
                        }
                    }
                }
            }
        }
        System.out.print(c);
    }
}