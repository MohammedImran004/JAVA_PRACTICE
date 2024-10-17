import java.util.Scanner;
public class ReverseSpiralRotation {
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for(int i = 0; i< n ; i ++){
                for(int j=0;j< m ; j++){
                    arr[i][j]=sc.nextInt();
                }
            }
           int top=n-1,right=m-1,left=0,bottom=0;
             while(top >= bottom && right >= left){
                for(int i =left ; i <= top ; i++)
                {
                    System.out.print(arr[i][bottom]+" ");
                }
                bottom++;
                for(int i= bottom ; i<=right;i++)
                {
                    System.out.print(arr[top][i]+" ");
                }
                top--;
                if(bottom<=right)
                {
                for(int i = top ; i>=left;i--)
                {
                    System.out.print(arr[i][right]+" ");
                }
                right--;
                }
                if(left<=top)
                {
                for(int i = right ; i>=bottom;i--)
                {
                    System.out.print(arr[left][i]+" ");
                }
                left++;
                }
            }
        }
}
