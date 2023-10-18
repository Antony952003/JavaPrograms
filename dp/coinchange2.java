package dp;
import java.util.*;
public class coinchange2 {
     static int f(int index,int target,int coins[],int n,int dp[][])
    {
        if(index == n-1)
        {
            if(target % coins[n-1] == 0)
                return 1;
            else
                return 0;
        }
        if(dp[index][target] !=-1)
            return dp[index][target];
        int nottake = f(index+1, target, coins, n,dp);
        int take = 0;
        if(coins[index] <= target)
            take = f(index, target - coins[index], coins, n,dp);
        return dp[index][target] = take + nottake;
    }  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int coins[] = new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int dp[][] = new int[n][target+1];
           for(int i=0;i<n;i++)
            for(int j=0;j<=target;j++)
                dp[i][j] = -1;  
        System.out.println(f(0,target,coins,n,dp));
        /* for(int i=0;i<=target;i++)
        {
            if(i%coins[0]==0)   dp[i] = 1; 
            else     dp[i] = 0; 
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<=target;j++)
            {
                int nottake =  dp[j];
                int take = 0;
                if(coins[i] <= j)
                    take = dp[j-coins[i]];
                dp[j] = take + nottake;
            }
        }
        System.out.println(dp[target]); */
    }
}
