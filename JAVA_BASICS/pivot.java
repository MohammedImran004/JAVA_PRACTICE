import java.util.*;
public class pivot{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] newarr = new int[n];
        int l=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int i=0,z=0,f=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j]<m)
            {
                newarr[i]=arr[j];
                i++;
            }
            l=i;
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]==m)
            {
                newarr[i]=arr[j];
                i++;
            }
            z=i;
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]>m)
            {
                newarr[i]=arr[j];
                i++;
            }
            f=i;
        }
        for(int k=0;k<l;k++)
        {
          for(int j=0;j<l;j++)
          {
            int temp = 0;
                if (newarr[k] > newarr[j]) {
                    temp = newarr[j];
                    newarr[j] = newarr[k];
                    newarr[k] = temp;
                }
          }
        }
        for(int k=z;k<f;k++)
        {
          for(int j=z;j<f;j++)
          {
            int temp = 0;
                if (newarr[k] > newarr[j]) {
                    temp = newarr[j];
                    newarr[j] = newarr[k];
                    newarr[k] = temp;
                }
          }
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(newarr[j]);
        }
        }
}