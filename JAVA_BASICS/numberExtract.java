import java.util.*;

public class numberExtract{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] inputs = new String[n];
        for (int i = 0; i < n; i++) {
            inputs[i] = sc.nextLine();
        }

        for (int k = 0; k < n; k++) {
            String s = inputs[k];
            String d;
            int c = 0;
            String[] arr = new String[s.length()];
            int numCount = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    numCount++;
                    if (arr[c] == null) {
                        arr[c] = "";
                    }
                    arr[c] += s.charAt(i);
                } else {
                    c++;
                }
            }

            for (String i : arr) {
                int Check = 0;
                if (i != null) {
                    d = (String) i;
                    for (int j = 0; j < d.length(); j++) {
                        if (d.charAt(j) == '9') {
                            Check++;
                        }
                    }
                    if (Check == 0) {
                        System.out.print(i + " ");
                    }
                }
            }

            if (numCount == 0) {
                System.out.print("-1");
            }
            System.out.println();
        }
    }
}
