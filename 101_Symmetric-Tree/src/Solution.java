/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isTheSame(root.left , root.right);
    }

    public boolean isTheSame(TreeNode a , TreeNode b){
        if(a==null && b==null)
            return true;
        else if(a==null && b!=null)
            return false;
        else if(a!=null && b==null)
            return false;
        else if(a.val!=b.val)
            return false;
        else
            return isTheSame(a.left , b.right) && isTheSame(a.right , b.left);
    }
}
