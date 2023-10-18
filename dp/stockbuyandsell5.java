package dp;
import java.util.*;
public class stockbuyandsell5 {

        /*stock buy and sell part 3 is about to buy and sell stocks 
     unlimited no of times with a cooldown(we can't buy just the after we have sold a stock) 
     and get the max profit*/

    /* static int f(int i,int buy,int arr[],int n,int dp[][])
    {
        if(i > n-1)
            return 0;
        int profit = 0;
        if(dp[i][buy] != -1)
            return dp[i][buy];
        if(buy == 1)
        {
            profit = Math.max((-arr[i] + f(i+1, 0, arr, n,dp)),(0 + f(i+1, 1, arr, n,dp)));
        }
        else{
            profit = Math.max(arr[i] + f(i+2, 1, arr, n,dp), 0 + f(i+1, 0, arr, n,dp));
        }
        return dp[i][buy] = profit;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
         /* int dp[][] = new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                dp[i][j] = -1;
            }
        }  */
        //System.out.println(f(0,1,arr,n,dp));
        int dp[][] = new int[n+2][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                dp[i][j] = 0;
            }
        }
        for(int i=n-1;i>=0;i--)
        {
            dp[i][1] = Math.max(-arr[i] + dp[i+1][0], dp[i+1][1]);
            dp[i][0] = Math.max(arr[i] + dp[i+2][1], dp[i+1][0]);
        }
        System.out.println(dp[0][1]);

    }
}
