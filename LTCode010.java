public class LTCode010 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            twos |= ones & num;
            ones ^= num;          
            int threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones; 
    }
    public static void main(String[] args) {
        LTCode010 solution = new LTCode010();
        int[] nums = {2, 2, 3, 2};
        System.out.println(solution.singleNumber(nums)); 
    }
}

