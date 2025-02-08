public class LTCode002 {
    public int reverse(int x) {
        int result = 0;
        int sign = x < 0 ? -1 : 1; // Store the sign of the number
        x = Math.abs(x); // Take the absolute value of x

        while (x != 0) {
            int digit = x % 10; // Extract the last digit
            x /= 10; // Remove the last digit from x

            // Check for overflow before updating result
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; // Overflow check
            }

            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; // Underflow check
            }

            result = result * 10 + digit; // Update the result
        }

        return sign * result; // Return the result with the correct sign
    }

    public static void main(String[] args) {
        LTCode002 solution = new LTCode002();

        // Example inputs to test the reverse function
        int input = 123;
        int reversed = solution.reverse(input);
        System.out.println("Reversed: " + reversed);  // Output: 321

        input = -123;
        reversed = solution.reverse(input);
        System.out.println("Reversed: " + reversed);  // Output: -321

        input = 120;
        reversed = solution.reverse(input);
        System.out.println("Reversed: " + reversed);  // Output: 21

        input = 0;
        reversed = solution.reverse(input);
        System.out.println("Reversed: " + reversed);  // Output: 0
    }
}
