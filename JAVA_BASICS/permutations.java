import java.util.*;
public class permutations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> li = new ArrayList<>();
        boolean arr[] = new boolean[s.length()];
        generate("",arr,li,s);
        System.out.println(li.size());
        Collections.sort(li);
        for(String result:li)
        {
            System.out.println(result);
        }
    }
    static void generate(String current , boolean arr[],List<String> li,String s)
    {
        if(current.length() == s.length())
        {
            li.add(current);
            return;
        }
        else
        {
            for(int i = 0 ; i < s.length() ; i++)
            {
                if(!arr[i])
                {
                    arr[i]=true;
                    generate(current+s.charAt(i),arr,li,s);
                    arr[i]=false;
                }
            }
        }
    }
}