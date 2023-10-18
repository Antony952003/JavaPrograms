package dp;

import java.util.Scanner;

public class stockbuyandsell4 {

        /*stock buy and sell part 3 is about to buy and sell stocks 
     k no of times and get the max profit*/

    static int f(int i,int buy,int k,int arr[],int n,int dp[][][])
    {
        if(i == n)
            return 0;
        if(k == 0)
            return 0;
        if(dp[i][buy][k] !=-1)
            return dp[i][buy][k];
        int profit = 0;
        if(buy==1)
        {
            profit = Math.max(-arr[i] + f(i+1, 0, k, arr, n,dp),0 + f(i+1, 1, k, arr, n,dp));
        }
        else{
            profit = Math.max(arr[i] + f(i+1, 1, k-1, arr, n,dp),0 + f(i+1, 0, k, arr, n,dp));
        }
        return dp[i][buy][k] =  profit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
/*         int dp[][][] = new int[n][2][k+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int h=0;h<=k;h++)
                {
                    dp[i][j][h] = -1;
                }
            }
        }
        System.out.println(f(0,1,k,arr,n,dp)); */
        int dp[][][] = new int[n+1][2][k+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int h=0;h<=k;h++)
                {
                    dp[i][j][h] = 0;
                }
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int buy=0;buy<2;buy++)
            {
                for(int cap=1;cap<=k;cap++)
                {
                    if(buy == 1)
                    {
                        dp[i][buy][cap] = Math.max(-arr[i] + dp[i+1][0][cap], 0 + dp[i+1][1][cap]);  
                    }
                    else
                    {
                        dp[i][buy][cap] = Math.max(arr[i] + dp[i+1][1][cap-1], 0 + dp[i+1][0][cap]); 
                    }
                }
            }
        }
        System.out.println(dp[0][1][k]);

    }
}
