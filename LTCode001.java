public class LTCode001 {
    public boolean isPalindrome(int x) {
        // Convert the integer to a string
        String st = Integer.toString(x);
        
        // Loop to check characters from the start and end of the string
        for (int i = 0; i < st.length() / 2; i++) {
            char start = st.charAt(i);
            char end = st.charAt(st.length() - 1 - i);
            if (start != end) {
                return false;  // Not a palindrome
            }
        }
        return true;  // It's a palindrome
    }

    public static void main(String[] args) {
        LTCode001 leetcode001 = new LTCode001();  // Instantiate the class correctly
        System.out.println(leetcode001.isPalindrome(12321));  // Should return true
    }
}
