package dp;
import java.util.*;
public class stockbuyandsell3 {
        /*stock buy and sell part 3 is about to buy and sell stocks 
     2 times and get the max profit*/



    /* static int f(int i,int buy,int cap,int arr[],int n,int dp[][][])
    {
        if(i == n)
            return 0;
        if(cap == 0)
            return 0;
        if(dp[i][buy][cap]!=-1)
            return dp[i][buy][cap];
        int profit = 0;
        if(buy==1)
        {
            profit = Math.max(-arr[i] + f(i+1, 0, cap, arr,n,dp), 0 + f(i+1, 1, cap, arr,n,dp) );
        }
        else{
            profit = Math.max(arr[i] + f(i+1, 1, cap-1, arr,n,dp), 0 + f(i+1, 0, cap, arr,n,dp) );
        }
        return dp[i][buy][cap] = profit;
    } */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] =sc.nextInt();
        }
        int dp[][][] = new int[n+1][2][3];
/*         for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<=2;k++)
                {
                    dp[i][j][k] = -1;
                }
            }
        } */
       // System.out.println(f(0,1,cap,arr,n,dp));
       for(int i=0;i<=n;i++)
       {
           for(int j=0;j<2;j++)
           {
               for(int k=0;k<=2;k++)
               {
                   dp[i][j][k] = 0;
               }
           }
       }
       for(int i=n-1;i>=0;i--)
       {
            for(int j=0;j<2;j++)
            {
                for(int k=1;k<=2;k++)
                {
                    if(j == 1)
                {
                    dp[i][j][k] = Math.max(-arr[i] + dp[i+1][0][k] ,0 + dp[i+1][1][k]);
                }
                else{
                    dp[i][j][k]  = Math.max(arr[i] + dp[i+1][1][k-1], 0 + dp[i+1][0][k]);
                }
                }
            }
       }
       System.out.println(dp[0][1][2]);
    }
}
