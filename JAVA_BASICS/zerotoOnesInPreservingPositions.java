// N=4
// 1 ST PASS ={1,1,1,1};
// 2 ST PASS ={1,0,1,0};
// 3 ST PASS ={1,0,0,0};
// 4 ST PASS ={1,0,0,1};
// COUNT OF 1 =2
import java.util.*;
public class zerotoOnesInPreservingPositions{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c=0;
        for(int i=1;i<=n;i++)
        {
        for(int j=1;j<=n;j++)
        {
            if(j%i==0)
            {
                if(arr[j-1]==1)
                {
                    arr[j-1]=0;
                }
                else
                {
                    arr[j-1]=1;
                }
            }
        }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                c++;
            }
            
        }
        System.out.print(c);
    }
}
