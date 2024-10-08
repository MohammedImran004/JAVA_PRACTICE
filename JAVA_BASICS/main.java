import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] d = s.toCharArray();
        int z = -1;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (d[i] == d[j]) {
                    z = Math.max(z, j - i - 1);
                }
            }
        }

        System.out.println(z);
    }
}
