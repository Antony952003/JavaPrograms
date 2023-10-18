package dp;

import java.util.Scanner;

public class minimumcoins {
    /* static int f(int index,int target,int coins[],int n,int dp[][])
    {
        if(index == n-1)
        {
            if(target % coins[index] == 0)
            {
                return target / coins[index];
            }
            return 999999;
        }
        if(dp[index][target] != -1)
            return dp[index][target];
        int nottake = 0 + f(index+1, target, coins, n,dp);
        int take = 99999;
        if(coins[index] <= target)
            take = 1 + f(index, target - coins[index], coins, n,dp);
        return dp[index][target] = Math.min(nottake, take);
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int coins[] = new int[n];
        for(int i=0;i<n;i++)
        {
            coins[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int front[] = new int[target+1];
        /* for(int i=0;i<n;i++)
        {
            for(int j=0;j<=target;j++)
            {
                dp[i][j] = -1;
            }
        } */
        //System.out.println(f(0, target, coins, n,dp));

            for(int j=0;j<=target;j++)
            {
                front[j] = 9999;
            }
        
        for(int i=0;i<=target;i++)
        {
            if(i % coins[0]==0)
                front[i] = i/coins[0];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=target;j>=0;j--)
            {
                int nottake = 0 + front[j];
                int take = 99999;
                if(coins[i] <= j)
                    take = 1 + front[j-coins[i]];
                front[j] = Math.min(nottake, take);
            }
        }
        System.out.println(front[target]);
    }
}
