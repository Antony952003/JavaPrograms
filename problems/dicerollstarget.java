package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class dicerollstarget {
    static int f(int n,int k,int target,int dp[][])
    {
        int count = 0;
        if(n<0 || target < 0) return 0;
        if(target == 0)
        {
            if(n==0)
                return 1;
            return 0;
        }
        if(dp[n][target]!=-1)   return dp[n][target];
        for(int i=1;i<=k&&i<=target;i++)
        {
            count = (count + f(n-1, k, target - i,dp)) % 1000000007;
        }
        return dp[n][target] = count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int target = sc.nextInt();
        int dp[][] = new int[n+1][target+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=target;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println("The ans is "+f(n,k,target,dp)); 
    }
}
