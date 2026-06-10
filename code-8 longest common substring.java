import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        int maxLength = 0;

        for (int row = 1; row <= m; row++) {
            for (int col = 1; col <= n; col++) {

                if (s2.charAt(row - 1) == s1.charAt(col - 1)) {
                    dp[row][col] = dp[row - 1][col - 1] + 1;

                    if (dp[row][col] > maxLength) {
                        maxLength = dp[row][col];
                    }
                } else {
                    dp[row][col] = 0;
                }
            }
        }

        System.out.println(maxLength);
    }
}
