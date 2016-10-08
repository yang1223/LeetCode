/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Solution {
    public int addDigits(int num) {
        if(num==0) return 0;
        return num%9==0?9:num%9;
    }

    public static void main(String[] args) {
        int n = 12345;
        int result = new Solution().addDigits(n);
        System.out.println(result);
    }
}
