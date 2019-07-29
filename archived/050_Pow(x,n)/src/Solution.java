/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Solution {
    public double myPow(double x, int n) {
        if(x==1) return 1;
        if(x==-1) return n%2==0?1:-1;
        if(n==0) return 1;
        if(n>0){
            if(n==1)
                return x;
            else if(n%2==0)
                return myPow(x*x, n/2);
            else
                return x*myPow(x, n-1);
        } else {
            return myPow(1/x, -n);
        }
    }

    public static void main(String[] args) {
        double x = 8.88023;
        int n = 3;
        double result = new Solution().myPow(x,n);
        System.out.println(result);
    }
}
