import java.util.Scanner;

public class BinaryAddition {
    
    // Function to add two binary numbers
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }
            result.insert(0, sum % 2);
            carry = sum / 2;
        }
        
        if (carry > 0) {
            result.insert(0, carry);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.next();
        
        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.next();
        
        // Pad the shorter binary number with zeros
        int maxLength = Math.max(binary1.length(), binary2.length());
        binary1 = String.format("%" + maxLength + "s", binary1).replace(' ', '0');
        binary2 = String.format("%" + maxLength + "s", binary2).replace(' ', '0');
        
        String sum = addBinary(binary1, binary2);
        System.out.println("Sum of the binary numbers: " + sum);
        
        scanner.close();
    }
}
