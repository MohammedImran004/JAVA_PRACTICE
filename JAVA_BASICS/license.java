import java.util.*;
public class license{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = sc.nextLine();
        String arr[] = str.split(" ");
        int max = 0 , length = arr[0].length() , result = 0 , chksame=0 ;
        boolean same = false;
        int ans[] = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++)
        {
            String lr =s.toLowerCase();
            StringBuilder lwr = new StringBuilder(lr);
            int c=0;
            for(int j = 0 ; j < arr[i].length() ; j++)
            {
                StringBuilder word = new StringBuilder(arr[i]);
                for(int k = 0 ; k < lwr.length() ; k++)
                {
                    if((word.charAt(j)==lwr.charAt(k)) && word.charAt(j)!=' ')
                    {
                        lwr.setCharAt(k,' ');
                        word.setCharAt(j,' ');
                        c++;
                    }
                }
            }
            ans[i] = c;
        }
        chksame = ans[0];
        int cnt = 1;
        for(int i = 1 ; i < ans.length ; i++)
        {
            if(chksame == ans[i])
            {
                cnt++;
            }
        }
        if(cnt==arr.length)
        {
            same = true;
        }
        if(same)
        {
            for(int i = 1 ; i < arr.length ; i++)
            {
               if(length > arr[i].length()) 
               {
                   length = arr[i].length();
                   result = i;
               }
            }
            System.out.print(arr[result]);
        }
        else
        {
             max = ans[0];
            for(int i = 1 ; i < arr.length ; i++)
            {
                if(max < ans[i])
                {
                    result=i;
                }
            }
            System.out.print(arr[result]);
        }
        
    }
}