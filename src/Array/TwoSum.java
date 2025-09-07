package Array;

import java.util.HashMap;

/**
 * The TwoSum class provides a method to find two indices in an array
 * such that the numbers at those indices add up to a specific target.
 */
public class TwoSum {
    /**
     * Finds two indices in the given array whose values sum to the specified target.
     * <p>
     * This method checks all pairs of elements in the array. If a pair is found
     * whose sum equals the target, their indices are returned. If no such pair exists,
     * returns {-1, -1}.
     *
     * @param nums   the array of integers to search
     * @param target the target sum to find
     * @return an array containing the indices of the two numbers that add up to target,
     *         or {-1, -1} if no such pair exists
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    /**
     * Finds two indices in the given array such that the numbers at those indices add up to the given target.
     * Uses a HashMap for efficient lookup of complements.
     *
     * @param nums   the array of integers to search
     * @param target the target sum to find
     * @return an array containing the indices of the two numbers that add up to target,
     *         or {-1, -1} if no such pair exists
     */
    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> num_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (num_map.containsKey(complement)) {
                return new int[] { num_map.get(complement), i };
            }
            num_map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
