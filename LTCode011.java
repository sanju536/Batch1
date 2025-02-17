import java.util.*;
public class LTCode011 {
    public int[] singleNumber(int[] nums) {
        int xor_result = 0;
        for (int num : nums) {
            xor_result ^= num;
        }
        int rightmost_bit = xor_result & -xor_result;
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & rightmost_bit) != 0) {
                num1 ^= num;  
            } else {
                num2 ^= num;  
            }
        }
        return new int[]{num1, num2};
    }
    public static void main(String[] args) {
        LTCode011 solution = new LTCode011();
        int[] nums1 = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(solution.singleNumber(nums1)));  
        int[] nums2 = {-1, 0};
        System.out.println(Arrays.toString(solution.singleNumber(nums2)));  
        int[] nums3 = {0, 1};
        System.out.println(Arrays.toString(solution.singleNumber(nums3)));
    }
}
