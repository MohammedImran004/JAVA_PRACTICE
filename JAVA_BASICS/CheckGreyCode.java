import java.util.*;
public class CheckGreyCode{
    public static void greyCode(int num[],int d)
    {
        boolean grey  = false;
        for(int i  = 1 ; i < d ; i++)
        {
            if((Integer.bitCount(num[i]) ^ Integer.bitCount(num[i-1]))==1)
            {
                grey = true;
            }
        }
        if((Integer.bitCount(num[0]) ^ Integer.bitCount(num[d-1]))!=1)
        {
            grey=false;
        }
        if(grey){
            System.out.print("true");
        }
        else
        {
            System.out.print("false");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c[] = s.toCharArray();
        int num[] = new int[c.length];
        int d  = 0 ; 
        for(int i = 0 ; i < c.length ; i++)
        {
            if(c[i]>='0' && c[i]<='9'){
                num[d]=c[i]-'0';
                d++;
            }
        }
        greyCode(num,d);
    }
}