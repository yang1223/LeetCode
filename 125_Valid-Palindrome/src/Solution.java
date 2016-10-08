/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Solution {

    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\w]","").toLowerCase();
        for (int i = 0 , l = s.length(); i < l/2; i++) {
            if (s.charAt(i)!=s.charAt(l-i-1)) return false;
        }
        return true;
    }

    // reverse the string by StringBuilder
    public boolean isPalindrome_reverseVersion(String s) {
        String s1 = s.replaceAll("[^\\w]","").toLowerCase();
        String s2 = new StringBuilder(s1).reverse().toString();
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = new Solution().isPalindrome(s);
        System.out.println(result);
    }
}
