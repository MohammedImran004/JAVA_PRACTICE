import java.util.*;
public class frequency{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer,Integer> hs  = new HashMap<>();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int  i = 0 ; i  <  n ; i ++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
       int c = 1 , d= 0 ,ix=0 ;
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = i+1 ; j < n ; j ++)
            {
                if ((arr[i]==arr[j]) && arr[i]!=0)
                {
                    c++;
                    arr[j]=0;
                }
               
            }
            if(arr[i]!=0)
            {
            hs.put(d,arr[i]);
            d++;
            ar.add(c);
            }
            c=1;
            
        }
        d=ar.size();
        for(int i = 0 ; i < d ;i++)
        {
             c=Collections.max(ar);
             ix = ar.indexOf(c);
            for(int j = 0 ; j < c ; j++)
            {
                System.out.print(hs.get(ix)+" ");
            }
            ar.set(ix,0);
        }
       
    }
}
