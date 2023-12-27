package String;

public class CheckPalindrome {

    /**
     * Given a string s, check if it is a palindrome.
     * <p>
     * s= "madam"
     */

    static boolean isPalindrome(String s) {
        int ptr1 = 0;
        int ptr2 = s.length() - 1;

        while (ptr1 < ptr2) {
            if (s.charAt(ptr1) != s.charAt(ptr2)) {
                return false;
            }
            ptr1++;
            ptr2--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("kunal"));

    }
}
// time complexity O(N);
// space complexity O(1);