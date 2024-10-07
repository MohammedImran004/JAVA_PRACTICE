import java.util.Scanner;

public class BitShiftExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Taking input from user
        
        // Extracting the left 4 bits and right 4 bits
        int left4Bits = (num & 0xF0) >> 4;
        int right4Bits = (num & 0x0F) << 4;
        
        // Combining the swapped bits
        int result = left4Bits | right4Bits;
        
        System.out.println("Input: " + num);
        System.out.println("Result: " + result);
        
        scanner.close();
    }
}
