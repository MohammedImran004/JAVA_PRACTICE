import java.util.*;

public class rotatedversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String res = sc.next();
            char[] d = s.toCharArray();
            int k = s.length();
            char temp;

            boolean isRotated = false;

            for (int ie = 0; ie < k; ie++) {
                temp = d[s.length() - 1];
                for (int j = s.length() - 1; j > 0; j--) {
                    d[j] = d[j - 1];
                }
                d[0] = temp;
                String chk = String.valueOf(d);
                if (chk.equals(res)) {
                    isRotated = true;
                    break;
                }
            }

            if (isRotated) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
