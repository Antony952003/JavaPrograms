package dp;

import java.util.Scanner;

public class matrixchainmultiplication {
/*     static int f(int i,int j,int arr[],int dp[][])
    {  
        if(i == j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j]; 
        int min = 999999;
        for(int k=i;k<j;k++)
        {
            int steps = (arr[i-1] * arr[k] * arr[j]) + f(i, k, arr, dp) + f(k+1, j, arr, dp);
            min = Math.min(min, steps);
        }
        return dp[i][j] = min; 
    } */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        //int dp[][] = new int[n][n];
        /* for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j] = -1;
            }
        } */
        //System.out.println(f(1,n-1,arr,dp));
        int dp[][] = new int[n][n];
        for(int i=1;i<n;i++)
            dp[i][i] = 0;
        for(int i=n-1;i>=1;i--)
        {
            for(int j=i+1;j<n;j++)
            {
                int min = 999999;
                for(int k=i;k<j;k++)
                {
                    int steps = (arr[i-1] * arr[k] * arr[j]) + dp[i][k]  + dp[k+1][j];
                    min = Math.min(min, steps);
                }
                dp[i][j] = min; 
            }
        }
        System.out.println(dp[1][n-1]);
    }
}
