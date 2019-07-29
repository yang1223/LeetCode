/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Main {
    public static void main(String[] args) {

        String input = "pwwkew";
        input = "aa";
        input = "abcabcbb";

        int result = new Solution().lengthOfLongestSubstring(input);

        System.out.println(result);
    }
}
