import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n = s1.length();
        int m = s2.length();
        int[][] dp = new int[n + 1][m + 1];
        int maxLength = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= m; col++) {
                if (s1.charAt(row - 1) == s2.charAt(col - 1)) {
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
