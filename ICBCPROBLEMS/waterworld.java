import java.util.Scanner;

public class waterworld{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int tot = 0;
            
            for (int i = 0; i < n * m; i++) {
                int a = scanner.nextInt();
                tot += a;
            }
            
            System.out.printf("%.9f%n", (double) tot / (n * m));
        }
        scanner.close();
    }
}
