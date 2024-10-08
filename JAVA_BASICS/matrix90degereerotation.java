import java.util.*;

public class matrix90degereerotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.next();
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length() - 1);
        String mat = sb.toString();
        int m = 0, n = 0;
        char[] tomat = mat.toCharArray();
        for (int i = 0; i < tomat.length; i++) {
            if (tomat[i]==',' && tomat[i-1]!=']') {
                n++;
            } else if (tomat[i] == ']') {
                m++;
            }
        }
        n = (n+m)/m;
       int[][] arr = new int[n][m];
        int r = 0, c = 0,d=0,temp=0;
        for (int i = 0; i < tomat.length; i++) {
            if (Character.isDigit(tomat[i])) {
                temp = Character.getNumericValue(tomat[i]);
                d=(d*10)+temp;
            }
            else if(tomat[i]==']')
            {
              arr[r][c] = d;
              d=0;
              c++;
            }
            else if(tomat[i]==',' && tomat[i-1]!=']')
            {
              arr[r][c] = d;
              d=0;
              c++;
            }
            if(c==m)
            {
              c=0;
              r++;
            }
        }
        
        System.out.print('[');
        
        for (int i = 0; i < n; i++) {
            System.out.print('[');
            for (int j = m - 1; j >= 0; j--) {
                System.out.print(arr[j][i]);
                if (j != 0) {
                    System.out.print(',');
                }
            }
            System.out.print(']');
            if (i != n - 1) {
                System.out.print(',');
            }
        }
        System.out.print(']');
    }
}