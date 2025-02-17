public class LTCode007 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        return result;
    }

    public static void main(String[] args) {
        LTCode007 solution = new LTCode007();
        int[] digits = {9, 9, 9}; // Example input
        int[] result = solution.plusOne(digits);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
