import java.util.Arrays;
import java.util.Scanner;

public class StringPermutations {
    public static void swap(char ar[], int i, int fi) {
        char temp = ar[i];
        ar[i] = ar[fi];
        ar[fi] = temp;
    }

    public static void permutation(char[] ar, int fi) {
        if (fi == ar.length - 1) {
            System.out.println(ar);
            return;
        }
        for (int i = fi; i < ar.length; i++) {
            swap(ar, i, fi);
            permutation(ar, fi + 1);
            swap(ar, i, fi);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray); // Sorting the character array
        permutation(charArray, 0);
    }
}
