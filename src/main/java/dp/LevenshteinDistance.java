package dp;

/**
 * Created by huzefa on 6/19/17.
 */
public class LevenshteinDistance {

    public int getDistance(String from, String to) {

        int[][] dp = new int[to.length() + 1][from.length() + 1];
        for (int i = 0; i <= from.length(); i++) {
            dp[0][i] = i;
        }
        for (int i = 0; i <= to.length(); i++) {
            dp[i][0] = i;
        }

        for (int i = 1; i <= to.length(); i++) {
            for (int j = 1; j <= from.length(); j++) {
                if (from.charAt(j - 1) == to.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                    continue;
                }
                dp[i][j] = 1 + getMinNeighbor(dp, i, j);
            }
        }

        return dp[to.length()][from.length()];
    }

    private int getMinNeighbor(int[][] dp, int i, int j) {
        int top = dp[i - 1][j];
        int left = dp[i][j - 1];
        int diag = dp[i - 1][j - 1];
        return Math.min(top, Math.min(left, diag));
    }
}
