package dp;

import java.util.Scanner;

public class totaluniquepaths {
    //dp recursive method
/*     static int f(int row,int col,int arr[][],int dp[][])
    {
        if(row==0 && col==0)
        {
            return 1;
        }
        if(row<0 || col<0)
        {
            return 0;
        }
        if(dp[row][col] != -1)
        {
            return dp[row][col];
        } 
        int up = f(row-1,col,arr,dp);
        int left = f(row, col-1, arr,dp);
        return dp[row][col] = up+left;
    } */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int dp[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j] = -1;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j] = 1;
                }
                else{
                    int down = 0;
                    int right = 0;
                    if(i>0)
                        down = dp[i-1][j];
                    if(j>0)
                        right = dp[i][j-1];
                    dp[i][j] = down + right;
                }
            }
        }
        System.out.println(dp[n-1][n-1]);
       // System.out.println(f(n-1,n-1,arr,dp));
    
    }

}
