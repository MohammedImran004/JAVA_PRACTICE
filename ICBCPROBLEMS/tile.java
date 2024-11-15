import java.util.*;
public class tile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char arr[][] = new char[h][w];
        char res[][] = new char[h][w];
        for(int i = 0; i < h; i++){
            String s = sc.next();
            for(int j = 0; j < w; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        System.out.println("Enter res coordinates");
        for(int i = 0; i < h; i++){
            String y = sc.next();
            for(int j = 0; j < w; j++){
                res[i][j] = y.charAt(j);
            }
        }
        //left
        char temp;
        for(int i = 0 ; i < h ; i++){
            for(int j = 0 ; j < w; j++){
                if(arr[i][j]>='a' && arr[i][j]<='z'){
                    while(j-1 >=0 && arr[i][j-1]=='.'){
                        temp = arr[i][j-1];
                        arr[i][j-1] = arr[i][j];
                        arr[i][j] = temp;
                        j--;
                    }
                }
            }
        }
        System.out.print(Arrays.deepToString(arr));
        //down
        for(int i = h -1 ; i >=0 ; i--){
            for(int j = 0 ; j < w; j++){
                if(arr[i][j]>='a' && arr[i][j]<='z'){
                    while(i+1 < h && arr[i+1][j]=='.'){
                        temp = arr[i+1][j];
                        arr[i+1][j] = arr[i][j];
                        arr[i][j] = temp;
                        i++;
                    }
                }
            }
        }
        System.out.print(Arrays.deepToString(arr));
        //right
        for(int i = 0 ; i < h ; i++){
            for(int j = w-1 ; j >=0; j--){
                if(arr[i][j]>='a' && arr[i][j]<='z'){
                    while(j+1 < w && arr[i][j+1]=='.'){
                        temp = arr[i][j+1];
                        arr[i][j+1] = arr[i][j];
                        arr[i][j] = temp;
                        j++;
                    }
                }
            }
        }
        System.out.print(Arrays.deepToString(arr));
        //up
        for(int i = 0 ; i < h ; i++){
            for(int j = 0 ; j < w; j++){
                if(arr[i][j]>='a' && arr[i][j]<='z'){
                    while(i-1 >= 0 && arr[i-1][j]=='.'){
                        temp = arr[i-1][j];
                        arr[i-1][j] = arr[i][j];
                        arr[i][j] = temp;
                        i--;
                    }
                }
            }
        }
        System.out.print(Arrays.deepToString(arr));
        for(int i = 0 ; i < h; i++){
            for(int j = 0 ; j < w ; j++){
                if(arr[i][j]!=res[i][j]){
                    System.out.println("no");
                    return;
                }
            }
        }
        System.out.println("yes");
    }
}
