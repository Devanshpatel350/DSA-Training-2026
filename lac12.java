import java.util.Arrays;
//write a code to find the nth fibonacci number using optimal approach
public class lac12 {

    static int fibo(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }

        // Memoization check
        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        System.out.println(fibo(n, dp));
    }
}


