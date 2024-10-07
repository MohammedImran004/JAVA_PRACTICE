import java.util.*;
public class Calculation{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=0;i<n;i++)
        {
        if(m>=100 && m<=10000)
        {
            int fh=0,h=0,ff=0,tw=0,te=0,fi=0,to=0,on=0;
            while(m>0)
            {
                if(m>=500)
                {
                    fh++;
                    m=m-500;
                }
                else if(m>=100)
                {
                    h++;
                    m=m-100;
                }
                else if(m>=50)
                {
                    ff++;
                    m=m-50;
                }
                else if(m>=20)
                {
                    tw++;
                    m=m-20;
                }
                else if(m>=10)
                {
                    te++;
                    m=m-10;
                }
                else if(m>=5)
                {
                    fi++;
                    m=m-5;
                }
                else if(m>=2)
                {
                    to++;
                    m=m-2;
                }
                else if(m>=1)
                {
                    on++;
                    m=m-1;
                }
            }
            System.out.print("500: "+fh+"\n"+"100: "+h+"\n"+"50: "+ff+"\n"+"20: "+tw+"\n"+"10: "+te+"\n"+"5: "+fi+"\n"+"2: "+to+"\n"+"1: "+on);
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
    }
}