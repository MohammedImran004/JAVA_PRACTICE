
import java.util.*;
public class uniquepairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<String> pairs = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            pairs.add(sc.nextLine());
            System.out.println(pairs.size());
        }
    }
}

