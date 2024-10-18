import java.util.*;
public class subArray{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int k=0;k<m;k++)
        {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
        }
        int sum=0;
        boolean d=false;
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
            sum+=arr[j];
            if(sum==0)
            {
                d=true;
                break;
            }
            }
            if(d)
            {
                break;
            }
            
        }
        if(d)
        {
          System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
    }
}