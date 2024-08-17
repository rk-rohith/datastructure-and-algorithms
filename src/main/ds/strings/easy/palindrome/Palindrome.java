package ds.strings.easy.palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return str.equals(revStr);

    }
}
