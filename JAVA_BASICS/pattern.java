// input : 4
//     J
//    IH
//   GFE
//  DCBA

import java.util.*;
public class pattern{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char start;
        int temp = n,f=0;
        while(temp>0)
        {
            f+=temp;
            temp--;
        }
        f=f-1;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                System.out.print(" "+" ");
            }
            for(int k=1;k<=i+1;k++)
            {
                start=(char)(65+f);
                System.out.print(start+" ");
                f--;
            }
            System.out.println();
        }
    }
}