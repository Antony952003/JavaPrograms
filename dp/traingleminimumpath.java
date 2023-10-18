package dp;

import java.util.Scanner;

public class traingleminimumpath {
 /*    static int f(int row,int col, int arr[][],int n, int dp[][])
    {
        if(row == n-1)
            return arr[row][col];
        if(dp[row][col] !=-1)
            return dp[row][col];
        int down = arr[row][col] + f(row+1, col, arr, n,dp);
        int diagonal = arr[row][col] + f(row+1, col+1, arr, n,dp);
        return dp[row][col] = Math.min(down, diagonal);
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        //space optimized
        int front[] = new int[n];
        for(int i=0;i<m;i++)
        {
            front[i] = arr[n-1][i];
        }
        for(int i=n-2;i>=0;i--)
        {
            int cur[] = new int[n];
            for(int j=0;j<=i;j++)
            {
                int down = arr[i][j] + front[j];
                int diag = arr[i][j] + front[j+1];
                cur[j] = Math.min(down, diag);
            }
            front = cur;
        }
        System.out.println(front[0]);
        /* int dp[][] = new int[n][m]; 
        for(int i=0;i<m;i++)
        {
            dp[n-1][i] = arr[n-1][i];
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<=n-2;j++)
            {
                int down = arr[i][j] + dp[i+1][j];
                int diag = arr[i][j] + dp[i+1][j+1];
                dp[i][j] = Math.min(down, diag);
            }
        } */
        
        //System.out.println(dp[0][0]);
        
        //System.out.println(f(0,0,arr,n,dp));

    }
}
