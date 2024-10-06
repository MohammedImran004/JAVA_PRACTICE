import java.util.*;

public class NumberCombinations {
    public static void main(String[] args) {
        String num = "234";
        String com[] = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder ans = new StringBuilder();

        int firstDigit = Character.getNumericValue(num.charAt(0));
        if (firstDigit == 0 || firstDigit == 1) {
            System.out.println("No Combinations are possible");
        } else {
            for (int i = 0; i < com[firstDigit].length(); i++) {
                char firstChar = com[firstDigit].charAt(i);
                for (int c = 1; c < num.length(); c++) {
                    int n = Character.getNumericValue(num.charAt(c));
                    for (int j = 0; j < com[n].length(); j++) {
                        ans.append(firstChar);
                        ans.append(com[n].charAt(j));
                        ans.append(" ");
                    }
                }
            }
            System.out.println(ans.toString());
        }
    }
}