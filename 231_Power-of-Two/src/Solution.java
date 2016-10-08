/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1))==0;
    }

    public static void main(String[] args) {
        int n = 127;
        boolean result = new Solution().isPowerOfTwo(n);
        System.out.println(result);
    }
}
