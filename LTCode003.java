public class LTCode003 {
    public int myAtoi(String s) {
        s = s.trim();        
        if (s.isEmpty()) {
            return 0;
        }
        int index = 0;
        int sign = 1;
        long result = 0;
        
        // Check if the first character is '+' or '-'
        if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (s.charAt(index) == '+') {
            index++;
        }

        // Convert the string to an integer until a non-digit is found
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            index++;
            
            // Check if result exceeds integer bounds
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        
        result *= sign; // Apply sign to the result
        return (int) result;
    }

    public static void main(String[] args) {
        LTCode003 solution = new LTCode003();
        
        // Test cases
        System.out.println(solution.myAtoi("42"));              // Output: 42
        System.out.println(solution.myAtoi(" -042"));           // Output: -42
        System.out.println(solution.myAtoi("1337c0d3"));        // Output: 1337
        System.out.println(solution.myAtoi("0-1"));             // Output: 0
        System.out.println(solution.myAtoi("words and 987"));   // Output: 0
        System.out.println(solution.myAtoi("   -2147483649")); // Output: -2147483648 (Integer.MIN_VALUE)
        System.out.println(solution.myAtoi("2147483648"));     // Output: 2147483647 (Integer.MAX_VALUE)
    }
}
