import java.util.*;
public class Segregation{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] newarr = new int[n];
        int other=0,z=0,o=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]!=0 && arr[i]!=1)
            {
                other++;
            }
            else if(arr[i]==0)
            {
                z++;
            }
        }
        if(other>0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            for(int i = 0 ; i < n ; i++)
            {
                if(i<z)
                {
                    newarr[i]=0;
                }
                else 
                {
                    newarr[i]=1;
                }
            }
            for(int k=0;k<n;k++)
            {
                System.out.print(newarr[k]+" ");
            }
        }
        
    }
}