import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yang Chi-Chang on 2016/10/8.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
        int result = 0;
        int left = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                left = left>map.get(c)+1 ? left:map.get(c)+1;
            }
            map.put(c,i);
            result = i-left+1>result? i-left+1:result;
        }
        return result;
    }
}
