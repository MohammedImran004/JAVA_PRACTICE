import java.util.*;
public class alphabetsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String al[] = new  String[3];
        int nu[] = new int[3];
        int num=0;
        for(int i = 0 ; i<3 ; i ++)
        {
            al[i] = sc.next();
        }
        for(int i = 0; i<3 ; i++)
        {
            char ch[] = al[i].toCharArray();
            for(int j = 0 ;j<ch.length;j++)
            {
                int temp = ch[j];
                temp = temp-97;
                num = num*10+temp;
            }
            nu[i]=num;
            num=0;
        }
        if(nu[0]+nu[1]==nu[2])
        {
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
