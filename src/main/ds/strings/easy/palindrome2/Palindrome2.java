package ds.strings.easy.palindrome2;

public class Palindrome2 {
    public static void main(String[] args) {
        int value = 1234321;
        System.out.println(isPalindrome(value));
    }

    private static boolean isPalindrome(int value) {
        int originalValue = value;
        int reverseValue = 0;
        while (value > 0) {
            reverseValue = (reverseValue * 10) + (value % 10);
            value = value / 10;
        }
        return originalValue == reverseValue;
    }
}
