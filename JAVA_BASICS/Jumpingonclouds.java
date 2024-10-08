import java.util.*;

public class Jumpingonclouds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of clouds
        int n = scanner.nextInt();
        
        // Read the clouds array
        int[] clouds = new int[n];
        for (int i = 0; i < n; i++) {
            clouds[i] = scanner.nextInt();
        }
        
        // Calculate and print the minimum number of jumps
        System.out.println(jumpingOnClouds(clouds));
        
        scanner.close();
    }
    
    // Method to calculate the minimum number of jumps
    static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;
        
        // Traverse the clouds array
        while (i < c.length - 1) {
            // Check if it's safe to jump 2 clouds ahead
            if (i + 2 < c.length && c[i + 2] == 0) {
                i += 2;
            } else {
                i += 1;
            }
            jumps++;
        }
        
        return jumps;
    }
}
