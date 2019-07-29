

/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class NumArray {

    int[] array;

    public NumArray(int[] nums) {
        array = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            array[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) return array[j];
        return array[j] - array[i-1];
    }

    // Your NumArray object will be instantiated and called as such:
    // NumArray numArray = new NumArray(nums);
    // numArray.sumRange(0, 1);
    // numArray.sumRange(1, 2);



}
