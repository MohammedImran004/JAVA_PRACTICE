import java.util.Scanner;
public class DnaSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
            String seq[] = new String[s.length() - 9];
            String res[] = new String[s.length() - 9];
        if (s.length() == 10) {
            System.out.print(s);
        } else {
            int ix = 0, d = 0, c = 0;
                for (int j = 0; j < s.length() - 9; j++) {
                    seq[ix] = s.substring(j, j + 10);
                    ix++;
                }
                String temp = "0"; 
                for(int i = 0 ; i < ix ; i++)
                {
                 temp = seq[i];
                for (int k = i+1; k < ix; k++) {
                    if (temp.equals(seq[k])) {
                        c++;
                        seq[k]="0";
                    }
                }
                if (c >= 1) {
                    res[d] = temp;
                    d++;
                }
                c = 0;
                }
            }
            int f = 0 ;
            while(res[f]!=null)
            {
                if(!(res[f].equals("0")))
                {
                System.out.println(res[f]);
                }
                f++;
            }
    }
}