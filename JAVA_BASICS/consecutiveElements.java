import java.util.*;
public class consecutiveElements{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int j=0;j<n;j++)
    {
        arr[j]=sc.nextInt();
    }
    int max=0,fimax=0;
    int k = sc.nextInt();
    if(k>n)
    {
        System.out.print("Invalid");
    }
    else
    {
    for(int i=0;i<(n/2)+1;i++)
    {
        max=0;
        for(int l=i;l<i+k;l++)
        {
          max+=arr[l];   
        }
        if(max>fimax)
        {
            fimax=max;
        }
    }
    System.out.print(fimax);
    }
    }
}