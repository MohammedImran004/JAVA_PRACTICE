import java.util.*;

public class reverseStringExceptNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String d;
        String[] arr = s.split(" ");
        int num=0;
        for (String i : arr) {
            d = i;
            char[] ch = d.toCharArray();

            for (int j = i.length() - 1; j >= 0; j--) {
                if (ch[j] >= '0' && ch[j] <= '9') {
                    for (int k = num; k < i.length(); k++) {
                        ++num;
                        if (ch[k] >= '0' && ch[k] <= '9' ) {
                            System.out.print(ch[k]);
                        }
                        else 
                        {
                            break;
                        }
                    }
                } else {
                    if (j == i.length() - 1) {
                        System.out.print(Character.toUpperCase(ch[j]));
                    } else {
                        System.out.print(Character.toLowerCase(ch[j]));
                    }
                }
            }
           System.out.print(" ");
           num=0;
        }
    }
}