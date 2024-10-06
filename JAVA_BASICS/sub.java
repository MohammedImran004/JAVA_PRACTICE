import java.util.*;
public class sub {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int  i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(arr[0]);
        for(int i = 1 ; i < n ; i++)
        {
            int temp = 0;
            if(arr[i]<=0)
            {
                continue;
            }
            else
            {
                for(int j = 0 ; j <= i ; j++)
                {
                    temp+=arr[j];
                }
                if(temp>ar.get(0))
                {
                    ar.set(0,temp);
                }
            }
        }
        System.out.print(ar.get(0));
    }
}
