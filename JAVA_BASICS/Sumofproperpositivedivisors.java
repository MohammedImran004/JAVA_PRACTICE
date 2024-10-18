import java.util.*;
public class Sumofproperpositivedivisors{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int nu[] = new int[n];
        for(int i=0;i<n;i++){
            nu[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j = 1 ;j < nu[i] ; j++)
            {
                if(nu[i]%j==0)
                {
                    sum+=j;
                }
            }
            if(sum==nu[i])
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            sum = 0 ;
        }
    }
}