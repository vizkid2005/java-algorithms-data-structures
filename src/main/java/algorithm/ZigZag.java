package algorithm;

import java.util.Map;
import java.util.TreeMap;

/**
 * LeetCode problem no 6
 */
public class ZigZag {

    public String makePattern(String s, int n) {
        if (n < 1 || s == null || s.equals("")) {
            return s;
        }
        if (n > s.length()) {
            return s;
        }
        Map<Integer, StringBuilder> ds = new TreeMap<>();
        int interval = 2 * n - 2;
        for (int i = 0; i < s.length(); i++) {
            int key = i % interval;
            if (ds.containsKey(key)) {
                ds.get(key).append(s.charAt(i));
                continue;
            }
            StringBuilder sb = new StringBuilder().append(s.charAt(i));
            ds.put(key, sb);
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : ds.values()) {
            ans.append(sb);
        }

        return ans.toString();

    }
}
