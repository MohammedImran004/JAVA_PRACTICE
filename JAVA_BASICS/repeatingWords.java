import java.util.*;

public class repeatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        String[] arr1 = new String[n];
        int c = 1,d=0;
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.next();
        }
        for (int k = 0; k < n; k++) {
            for (int j = k + 1; j < n; j++) {
                if (arr1[k].equals(arr1[j])) {
                    c++;
                    if (c == m) {
                        arr1[j] = " ";
                        d++;
                        c=0;
                    }
                }
            }
        }
        for (String word : arr1) {
            if(word==" ")
            {
                continue;
            }
            else
            {
            System.out.print(word + " ");
            }
        }
        System.out.println(d);
    }
}