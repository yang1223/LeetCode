import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yang on 2016/10/5.
 */
public class Solution {

    // Brute Force , O(n^2)
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0 ; i < nums.length ; i++) {
            int smallTarget = target - nums[i];
            for (int j = i+1; j < nums.length; j++) {
                if (smallTarget == nums[j]) {
                    return new int[] {i , j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    // HashMap , O(n)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer , Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return new int[] {map.get(nums[i]) , i};
            else
                map.put(target - nums[i],i);
        }
        return new int[] {-1,-1};
    }

}
