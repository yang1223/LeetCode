/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class VersionControl {
    private int badVersion;
    public VersionControl(int badVersion){
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int n){
        return n >= badVersion;
    }

}
