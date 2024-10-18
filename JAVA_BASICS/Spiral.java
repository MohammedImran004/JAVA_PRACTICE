import java.util.*;
public class Spiral{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        int top = 0 , right = n-1 , left = 0 , bottom = m-1;
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0 ; j< m ; j ++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
       while(left <= bottom && top <= right)
        {
        for(int i = left ; i <= right ; i++)
        {
            System.out.print(arr[i][left]+" ");
        }
        left++;
        for(int i = left ; i <= bottom ; i++)
        {
            System.out.print(arr[right][i]+" ");
        }
        right--;
        if(left <= bottom)
        {
        for(int i = right ; i >=top ; i--)
        {
            System.out.print(arr[i][bottom]+" ");
        }
        bottom--;
        }
        if(top<=right)
        {
        for(int i = bottom ; i >= left; i--)
        {
            System.out.print(arr[top][i]+" ");
        }
        top++;
        }
        }
    }
}