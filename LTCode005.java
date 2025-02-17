import java.util.HashMap;
import java.util.Map;

public class LTCode005 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {  // Fixed the loop condition to avoid infinite loop
            int x = nums[i];
            int y = target - x;
            if (d.containsKey(y)) {
                return new int[] {d.get(y), i};  // Return the indices of the two numbers that add up to the target
            }
            d.put(x, i);  // Store the number and its index in the map
        }
        return new int[] {};  // In case no solution is found, return empty array
    }

    public static void main(String[] args) {
        LTCode005 solution = new LTCode005();
        
        // Test the twoSum method
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        // Call the method and get the result
        int[] result = solution.twoSum(nums, target);
        
        // Print the result
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
