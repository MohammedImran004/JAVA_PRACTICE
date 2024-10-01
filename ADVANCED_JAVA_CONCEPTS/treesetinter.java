import java.util.*;
public class treesetinter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> ts1 = new TreeSet<>();
        for(int i = 0 ;i < n ; i ++)
        {
            int temp = sc.nextInt();
            ts1.add(temp);
        }
        int m = sc.nextInt();
        TreeSet<Integer> ts2 = new TreeSet<>();
        for(int i = 0 ;i < m ; i ++)
        {
            int temp1 = sc.nextInt();
            ts2.add(temp1);
        }
        System.out.println("First Element of TS1: "+ts1.first());
        System.out.println("Last Element of TS1: "+ts1.last());
        if(ts1.containsAll(ts2))
        {
            System.out.println("TS2 is a subset of TS1");
        }
        else
        {
            System.out.println("Not a subset");
        }
        Integer greatestLessThan25 = ts1.lower(25);
        System.out.println("Greatest element in the set TS1 less than 25: " + greatestLessThan25);
        Integer leastGreaterThan32 = ts1.higher(32);
        System.out.println("Least element in the set TS1 greater than 32: " + leastGreaterThan32);
        ts1.retainAll(ts2);
        System.out.println("Intersection of TS1 and TS2: "+ts1);
    }
}

