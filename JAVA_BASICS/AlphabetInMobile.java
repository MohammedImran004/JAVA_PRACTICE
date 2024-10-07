import java.util.*;
public class AlphabetInMobile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        String alp[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i = 0 ; i < n ;i ++)
        {
            words[i]=sc.next();
        }
        for(int i = 0 ; i < n ; i ++)
        {
        int ans = 0;
            for(int j = 0 ; j < words[i].length();j++)
            {
                char d[] = words[i].toCharArray();
                for(int k = 0 ; k < alp.length ; k++)
                {
                    for(int z=0;z<alp[k].length();z++)
                    {
                    char s[] = alp[k].toCharArray();
                    if(d[j]==s[z])
                    {
                        ans=ans*10+(k+2);
                    }
                    }
                }
            }
        System.out.println(ans);
        }
    }
}