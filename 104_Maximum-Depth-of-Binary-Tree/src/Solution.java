/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        else return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
