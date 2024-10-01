
import java.util.*;
import java.util.LinkedHashSet;
public class hashset{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        LinkedHashSet<Integer> lh = new LinkedHashSet<>();
        for(int i=0;i<n;i++)
        {
            int m = sc.nextInt();
            lh.add(m);
        }
        LinkedHashSet<Integer> lh1 = new LinkedHashSet<>(lh);
        System.out.println("Size of LH is: "+lh.size());
        System.out.println("Elements in LH: "+lh);
        Iterator<Integer> itr = lh1.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
            System.out.print(" ");
        }
            System.out.println();
        lh.clear();
        System.out.println("Size of LH after removing all the elements: "+lh.size());
        Integer arr[] = lh1.toArray(new Integer[n]);
        for(int i = 0 ; i  < n ; i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}