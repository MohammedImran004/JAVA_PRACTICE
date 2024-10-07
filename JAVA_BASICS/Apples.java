import java.util.*;
public class Apples{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int c = 0,en=(arr[n-1]/2)-(n-1);
        int max=arr[n-1];
        for(int i=0;i<max;i++)
        {
            for(int j = 0;j<n-1;j++)
            {
                if(arr[j]<max && arr[j]<en)
                {
                    arr[j]=arr[j]+1;
                    c++;
                    max--;
                }
            }
        }
        if(max>en)
        {
          c=c+(max-en);
        }
        System.out.print("No of moves = ");
        System.out.print(c);
        
    }
}