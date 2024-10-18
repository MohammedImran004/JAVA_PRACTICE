import java.util.*;
public class Triplets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] narr = new int[3];
        int sum=0,c=0,d=0,fin=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            for(int j=i+1;j<n;j++)
            {
                sum+=arr[j];
                for(int k=j+1;k<n;k++)
                {
                    sum+=arr[k];
                    if(sum==0)
                    {
                        narr[c]=arr[i];
                        narr[c+1]=arr[j];
                        narr[c+2]=arr[k];
                        c++;
                        d++;
                        if(d==1)
                        {
                          System.out.print("Elements are ");
                          for(int z=0;z<3;z++)
                          {
                            System.out.print(narr[z]+" ");
                            fin++;
                          }
                          System.out.println();
                          c=0;
                          d=0;
                        }   
                        break;
                    }
                    else
                    {
                        sum-=k;
                    }
                }
                if(sum==0)
                {
                    break;
                }
                else
                {
                    sum-=j;
                }
            }
            sum=0;
        }
        if(fin==0)
        {
          System.out.print("No Elements Found");
        }
    }
}