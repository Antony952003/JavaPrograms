package dp;
public class fibospace {
    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int[n+1];
        int prev2 = dp[0] = 0;
        int prev = dp[1] = 1;
        for(int i=2;i<=n;i++)
        {
            dp[i] = prev + prev2;
            prev2 = prev;
            prev = dp[i];
        }
        System.out.println(prev);
    }
}
