package dp;

import java.util.Scanner;

public class longestincreasingsubsequences {
    /* static int f(int i,int prev,int arr[],int n,int dp[][])
    {
        if(i == n)
            return 0;
        if(dp[i][prev+1]!=-1)
            return dp[i][prev+1];
        int take = 0;
        if(prev == -1 || arr[i] > arr[prev])
        {
        take = 1 + f(i+1, i, arr, n,dp);
        }
        int nottake = 0 + f(i+1, prev, arr, n,dp);
        return dp[i][prev+1] =  Math.max(take, nottake);
    } */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        /* int dp[][] = new int[n][n+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(f(0,-1,arr,n,dp)); */
        int dp[][] = new int[n+1][n+1];
        int prev[] = new int[n+1];
        int cur[] = new int[n+1];
            for(int j=0;j<=n;j++)
            {
                prev[j] = 0;
            }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i-1;j>=-1;j--)
            {
                int take = 0,nottake = 0;
                if(j == -1 || arr[i] > arr[j])
                {
                    take = 1 + prev[i+1];
                }
                    nottake = 0 + prev[j+1];
                cur[j+1] = Math.max(nottake, take);
            }
            prev = cur;
        }
        System.out.println(prev[0]);
    }
}
