import java.util.*;

public class Transform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        int  c = 1;
        String[] res = new String[str.length];
        char[] start = str[0].toCharArray();
        char[] end = str[str.length-1].toCharArray();
        boolean found=false;
        for (int i = 0; i < str.length; i++) {
            if(str[i]!=null)
            {
               for(int j=0;j<3;j++)
               {
                 char temp = start[j];
                 start[j]=end[j];
                 String transform = new String(start);
                 if(transform.equals(str[i]))
                 {
                   res[c]=transform;
                   c++;
                   found=true;
                   break;
                 }
                 else
                 {
                   start[j]=temp;
                 }
                 
            }
        }
        }
        res[0] = str[0];
        if(res[c-1].equals(str[str.length-1]))
        {
          for(int ie=0;ie<c;ie++)
          {
            System.out.print(res[ie]+" ");
          }
          
        }
        else
        {
          System.out.print("null");
        }
    }
}