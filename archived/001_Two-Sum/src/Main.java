/**
 * Created by Yang on 2016/10/5.
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,4,7};
        int target = 10;

        int[] result = new Solution().twoSum2(nums , target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
