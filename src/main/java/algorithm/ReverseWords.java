package algorithm;

/**
 * Reverse Words in String. LeetCode problem 151
 */
public class ReverseWords {

    public String reverseWords(String s) {
        if (s == null) {
            return s;
        }
        s = s.trim();
        if (s.equals("")) {
            return s;
        }

        char[] o = s.toCharArray();
        reverse(0, s.length() - 1, o);

        int i = 0;
        int j = 0;

        while (i < o.length && j < o.length) {
            while (o[j] != ' ') {
                j++;
                if (j == o.length) {
                    break;
                }
            }
            reverse(i, j - 1, o);
            j++;
            i = j;
        }

        return new String(o);
    }

    private void reverse(int start, int end, char[] s) {
        char temp;
        while (start < end) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
