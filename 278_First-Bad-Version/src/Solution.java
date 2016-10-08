/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Solution extends VersionControl {
    public Solution(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {
        return firstBadVersionHelper(1,n);
    }

    public int firstBadVersionHelper(int n1, int n2){
        if (n1==n2) {
            return n1;
        } else if(isBadVersion(n1+(n2-n1)/2)){
            return firstBadVersionHelper(n1,n1+(n2-n1)/2);
        } else {
            return firstBadVersionHelper(n1+(n2-n1)/2+1,n2);
        }
    }
}
