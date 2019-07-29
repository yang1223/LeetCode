/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Solution {
    public int hammingWeight(int n) {
        int ones = 0;
        while (n!=0) {
            if ((n & 1) == 1) ones++;
            n = n>>>1; //unsigned shift ">>>"
        }
        return ones;
    }

    public static void main(String[] args) {
        int n = 15;
        int result = new Solution().hammingWeight(n);
        System.out.println(result);

    }
}
