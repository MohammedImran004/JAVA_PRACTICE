import java.util.*;

public class master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char d[] = s.toCharArray();
        int c = 0;
        int ix = 0;
        int n = 0,st=0;
        String num1 = "0", num2 = "0";
        
        if (!(d[0] >= '0' && d[0] <= '9')) {
            c++;
        }
        if (!(d[1] == 'A' || d[1] == 'E' || d[1] == 'I' || d[1] == 'O' || d[1] == 'U')) {
            c++;
        }
        for (int i = 2; i < d.length; i++) {
            if ((d[i] >= '0' && d[i] <= '9')) {
                num1 += d[i];
                c++;
                st=i;
            }
            else
            {
            st=i;
            break;
            }
        }
        for (int j = st; j < d.length; j++) {
            if (d[j] == 'A' || d[j] == 'E' || d[j] == 'I' || d[j] == 'O' || d[j] == 'U') {
                c++;
            }
            if ((d[j] >= '0' && d[j] <= '9')) {
                num2 += d[j];
                c++;
            }
        }
        if (d[d.length - 1] == '[' || d[d.length - 1] == ']' || d[d.length - 1] == '{' || d[d.length - 1] == '}') {
            c++;
        }
        else{
            n++;
        }
        int num1Value = Integer.parseInt(num1);
        int num2Value = Integer.parseInt(num2);
        if (c!=d.length) {
            System.out.print("NO " + (num1Value - num2Value));
        } else {
            System.out.print("YES " + (num1Value + num2Value));
        }
        System.out.print(" "+c+" "+num1Value+" "+num2Value);
    }
}
