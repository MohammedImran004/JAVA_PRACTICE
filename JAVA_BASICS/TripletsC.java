import java.util.*;

public class TripletsC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] narr = new int[3];
        int fin = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == 0) {
                        narr[0] = arr[i];
                        narr[1] = arr[j];
                        narr[2] = arr[k];
                        System.out.print("Elements are ");
                        for (int z = 0; z < 3; z++) {
                            System.out.print(narr[z] + " ");
                        }
                        System.out.println();
                        fin++;
                    }
                }
            }
        }

        if (fin == 0) {
            System.out.print("No Elements Found");
        }
    }
}
