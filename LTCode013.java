public class LTCode013 {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;  
            product *= digit;    
            sum += digit;       
            n /= 10;             
        }
        return product - sum;  
    }
    public static void main(String[] args) {
        LTCode013 solution = new LTCode013();  
        int result = solution.subtractProductAndSum(536);  
        System.out.println("Result: " + result);  
    }
}
