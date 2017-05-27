package map;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            String word = words[i];
            if (map.containsKey(pattern.charAt(i))) {
                if (word != map.get(pattern.charAt(i))) {
                    return false;
                }
            }
            map.put(pattern.charAt(i), word);
        }
        return true;
    }
}
