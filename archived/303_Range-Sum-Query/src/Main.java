/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Main {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);

        System.out.println(numArray.sumRange(0,2));
        System.out.println(numArray.sumRange(2,5));
        System.out.println(numArray.sumRange(0,5));

    }
}
