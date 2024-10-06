import java.util.*;
public class Transporse {
    static void PrintArrays(int arr[][],int m,int n)
    {
        System.out.println("Before Transporse");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After TRansporse");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    static void GetArrayFromUsers(int arr[][],int m,int n)
    {
        Scanner s=new Scanner(System.in);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr = new int[m][n];
        GetArrayFromUsers(arr,m,n);
        PrintArrays(arr,m,n);
    }
}
