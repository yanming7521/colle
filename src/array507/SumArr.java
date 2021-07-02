package array507;

import java.util.HashMap;
import java.util.Map;

public class SumArr {
    public int xorOperation(int n, int start) {
        int num = 0;
        for(int i = 0; i < n; i++)
        {
            num = num ^ (start + 2 * i);
        }
        return num;
    }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                start = Math.max(map.get(alpha), start);
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        SumArr s1 = new SumArr();
        int i = s1.xorOperation(5, 0);
        System.out.println(i);
        int s = s1.lengthOfLongestSubstring("asdfasssa");
        System.out.println(s);
    }
}
