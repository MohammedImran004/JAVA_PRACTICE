import java.util.*;
public class reverseStringExceptNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String d;
        String[] arr = s.split(" ");
        char[] ch;
        char num;
        for(String i:arr)
        {
            d=i;
            ch=d.toCharArray();
            for(int j=i.length()-1;j>=0;j--)
            {
                if(ch[j]>='0' && ch[j]<='9')
                {
                    for(int k=0;k<i.length();k++)
                    {
                        if(ch[k]>='0' && ch[k]<='9' && ch[k]!=0)
                        {
                            System.out.print(ch[k]);
                            ch[k]=0;
                        }
                    }
                }
                else
                {
                    if(j==i.length()-1)
                    {
                        System.out.print(Character.toUpperCase(ch[j]));
                    }
                    else
                    {
                    System.out.print(Character.toLowerCase(ch[j]));
                    }
                }
            }
            System.out.print(" ");
        }
    }
}
